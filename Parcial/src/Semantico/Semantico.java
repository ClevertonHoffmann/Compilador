/*
 * Classe responsável pelas ações semânticas durante a análise sintática
 */
package Semantico;

import Token.InterfaceFlyweight;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Cleverton
 */
public class Semantico {

    Stack tabelaSimb = new Stack();
    //Stack tabelaTipos = new Stack();
    int at = 0;
    int dec = 0;
    String tipo = "";
    String tipoAt = "";

    public boolean acaoSemantica(int p, InterfaceFlyweight tok) {
        String token = tok.getToken().getTok();

        //---Inicio Bloco 0 - Salva valores do lexema e da posição na tabela de símbolos em formato de pilha
        tabelaSimb.add(criaVariavel(tok.getToken().getLex(), Integer.toString(tok.getToken().getPos())));
        //---Fim Bloco 0

        //---Inicio Bloco 1  - Verificação de duplicidade na declaração das variáveis
        //Valida a declaração da variável caso ela já tenha sido criada retorna erro
        if (dec == 1) {
            dec = 0;
            if (verificaDec(tipo, tok.getToken().getLex())) {
                System.out.println("Erro semântico a váriável " + tok.getToken().getLex() + " já foi declarada por um tipo!");
                return false;
            }
        }

        //Incrementa valor para após verificação de declaração de variável repetida
        if (token.equals("str") || token.equals("double") || token.equals("int") || token.equals("float") || token.equals("boolean")) {
            dec++;
            tipo = token;
        }

        //---Fim Bloco 1 
        //---Inicio Bloco 2 - Verificação se as variáveis já foram declaradas
        //Após o sinal de igual a variável at vai ser 1 e vai incrementando até o ponto e vírgula
        if (at > 0 && !token.equals("pv")) {
            at++;
        }

        //Validadação de declaração de variáveis do tipo int, boolean, double, float e str
        if (token.equals("at") || token.equals("inc") || token.equals("dec")) {
            HashMap<String, String> a = new HashMap();
            a = (HashMap<String, String>) tabelaSimb.get(tok.getToken().getPos() - 1);
            //System.out.println(a.get(""+(tok.getToken().getPos()-1)));
            if (!verificaVar(a.get("" + (tok.getToken().getPos() - 1)))) {
                System.out.println("Erro semântico a váriável " + a.values() + " não foi definida!");
                return false;
            }
            at = 1; //Atribui o valor de 1 no momento que possuir o sinal de atribuição para iniciar contagem
        }
        //---Fim Bloco 2 - Verificação se as variáveis já foram declaradas

        //---Inicio Bloco 3 - Verificação do tipo de atribuição após uma atribuição //FALTA TERMINAR
        //Validação da atribuição para as variáveis de acordo com o tipo int, boolean, double, float e str
        if (token.equals("pv") && at > 0) {
            return verficaTipo();
        }
        //---Fim Bloco 3 

        //---Inicio Bloco 4 - Verificação do else, else deve ser antecedido por um if //FALTA TERMINAR
        if (token.equals("else")) {

        }
        //---Fim Bloco 4 

        return true;
    }

    //Armazena o lexema e sua posição ao empilhar na análise sintática
    public HashMap criaVariavel(String lex, String pos) {
        HashMap<String, String> h2 = new HashMap();
        h2.put(pos, lex);
        return h2;
    }

    //Verifica a existência da criação das variáveis
    public boolean verificaDec(String tipo, String var) {
        HashMap<String, String> a = new HashMap();
        for (int i = 0; i < tabelaSimb.size() - 2; i++) {
            a = (HashMap<String, String>) tabelaSimb.get(i);
            if (a.containsValue(var)) {
                a = (HashMap<String, String>) tabelaSimb.get(i - 1);
                String val = a.get("" + (i - 1));
                if (val.equals("str") || val.equals("double") || val.equals("int") || val.equals("float") || val.equals("boolean")) {
                    return true;
                }
            }
        }
        return false;
    }

    //Verifica a criação das variáveis anteriormente a uma atribuição
    public boolean verificaVar(String var) {
        HashMap<String, String> a = new HashMap();
        for (int i = 0; i < tabelaSimb.size() - 2; i++) {
            a = (HashMap<String, String>) tabelaSimb.get(i);
            if (a.containsValue(var)) {
                a = (HashMap<String, String>) tabelaSimb.get(i - 1);
                String val = a.get("" + (i - 1));
                if (val.equals("str") || val.equals("double") || val.equals("int") || val.equals("float") || val.equals("boolean")) {
                    tipoAt = val; //Atribui o tipo na variável global para verificação posterior após término da atribuição da expressão
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Método responsável por analisar se as atribuições estão corretas
     */
    public boolean verficaTipo() {
        String val = "";
        HashMap<String, String> a = new HashMap();
        boolean aux = false;
        for (int i = tabelaSimb.size() - at; i < tabelaSimb.size() - 1; i++) {
            a = (HashMap<String, String>) tabelaSimb.get(i);
            val = a.get("" + i);
            //Ignora parenteses
            if (val.equals("(") || val.equals(")")) {
                //Não realiza nenhuma operação
            } else {
                //Número inteiro
                if (tipoAt.equals("int")) {
                    if (val.equals("++") || val.equals("--")) {
                        aux = true;
                    } else {
                        if (val.equals("+") || val.equals("-") || val.equals("*")) {
                            //Não faz nada pois soma e subtração de inteiros é sempre inteiro, apenas ignora símbolo
                        } else {
                            if (val.equals("/")) {
                                System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo int!");
                                return false;
                            } else {
                                //Verifica se é um número válido e se não é real então é inteiro
                                if (verificarNumeroValido(val)) {
                                    if (!verificarReal(val)) {
                                        aux = true;
                                    } else {
                                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo int!");
                                        return false;
                                    }
                                } else {
                                    //////////////////fazer verificação de variável inteira já atribuída
                                    System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo int!");
                                    return false;
                                }
                            }
                        }
                    }
                }
                //Número real
                if (tipoAt.equals("float") || tipoAt.equals("double")) {
                    if (val.equals("++") || val.equals("--")) {
                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo numérico real!");
                        return false;
                    }
                    if (verificarNumeroValido(val)) {
                        if (verificarReal(val)) {
                            aux = true;
                        } else {
                            System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo numérico real!");
                            return false;
                        }
                    } else {
                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo numérico real!");
                        return false;
                    }
                }
                //Booleano
                if (tipoAt.equals("boolean")) {
                    if (val.equals("++") || val.equals("--")) {
                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo booleano!");
                        return false;
                    }
                    if (val.equals("true") || val.equals("false")) {
                        aux = true;
                    }
                    if (val.equals(">") || val.equals("<")
                            ||val.equals(">=") || val.equals("<=")
                            ||val.equals("==") || val.equals("||")
                            ||val.equals("&&") || val.equals("!")|| val.equals("<>")) {
                        aux = true;
                    }
                }
                //String qualquer
                if (tipoAt.equals("str")) {
                    aux = val.matches("[A-z]+([a-zA-Z][0-9]+|_)+");
                    if(!aux){
                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo str!");
                        return false;  
                    }
                }
            }
        }
        ///PERSONALIZAR MENSAGENS DE RETORNO
        return aux;
    }

    public boolean verificarNumeroValido(String palavra) {
        boolean retorno = false;
        int cont = 0;
        if (palavra.length() == 1) {
            retorno = true;
        } else {
            for (int i = 1; i < palavra.length(); i++) {
                if (Character.isDigit(palavra.charAt(0))) {
                    if ((palavra.charAt(i) == ',') || (palavra.charAt(i) == '.')) {
                        cont++;
                    }
                    retorno = true;
                    if (Character.isDigit(palavra.charAt(i))) {
                        if (((palavra.charAt(palavra.length() - 1) != '.')
                                && (palavra.charAt(palavra.length() - 1) != ','))) {
                            retorno = true;
                        } else {
                            retorno = false;
                        }
                    } else {
                        retorno = false;
                    }
                } else {
                    retorno = false;
                    break;
                }
            }
        }
        if (cont > 1) {
            retorno = false;
        }
        return retorno;
    }

    public boolean verificarReal(String palavra) {
        boolean retorno = false;
        for (int i = 0; i < palavra.length(); i++) {
            if ((palavra.charAt(i) == ',') || (palavra.charAt(i) == '.') && (i != palavra.length() - 1)) {
                retorno = true;
                break;
            } else {
                retorno = false;
            }
        }
        return retorno;
    }
}
