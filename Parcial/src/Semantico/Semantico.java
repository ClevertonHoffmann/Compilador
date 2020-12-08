/*
 * Classe responsável pelas ações semânticas durante a análise sintática
 */
package Semantico;

import Token.InterfaceFlyweight;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Cleverton
 */
public class Semantico {

    public Stack tabelaSimb = new Stack();
    int at = 0;
    int dec = 0;
    String tipo = "";
    String tipoAt = "";

    /**
     * Médoto de análise semântica
     *
     * @param p int
     * @param tok token
     * @return Boolean
     */
    public boolean acaoSemantica(int p, InterfaceFlyweight tok) {
        String token = tok.getToken().getTok();

        //---Inicio Bloco 0 - Salva valores do lexema, posição, token, tipo, expressao na tabela de símbolos em formato de pilha
        tabelaSimb.add(criaVariavel(tok.getToken().getLex(), Integer.toString(tok.getToken().getPos()),tok.getToken().getTok(),"",""));
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
            ArrayList<String> a;
            a = (ArrayList<String>) tabelaSimb.get(tok.getToken().getPos() - 1);
            if (!verificaVar(a.get(0))) {
                System.out.println("Erro semântico a váriável " + a.get(0) + " não foi definida!");
                return false;
            }
            at = 1; //Atribui o valor de 1 no momento que possuir o sinal de atribuição para iniciar contagem
        }
        //---Fim Bloco 2 - Verificação se as variáveis já foram declaradas
        //---Inicio Bloco 3 - Verificação do tipo de atribuição após uma atribuição
        //Validação da atribuição para as variáveis de acordo com o tipo int, boolean, double, float e str
        if (token.equals("pv") && at > 0) {
            return verificaTipo();
        }
        //---Fim Bloco 3 

        //---Inicio Bloco 4 - Verificação do else, else deve ser antecedido por um if
//        if (token.equals("else")) {
//
//        }
        //---Fim Bloco 4 

        return true;
    }

     /**
      * Armazena o lexema e sua posição ao empilhar na análise sintática tabela de símbolos
      * @param lex
      * @param pos
      * @param tok
      * @param tip
      * @param exp
      * @return Array com as informações para serem adicionadas na tabela de símbolos
      */
    public ArrayList<String> criaVariavel(String lex, String pos, String tok, String tip, String exp) {
        ArrayList<String> tab = new ArrayList();
        tab.add(lex);
        tab.add(pos);
        tab.add(tok);
        tab.add(tip);
        tab.add(exp);
        return tab;
    }
      
    /**
     * Verifica a existência de duplicidade na declaração das variáveis
     *
     * @param tipo String
     * @param var String
     * @return Booelan
     */
    public boolean verificaDec(String tipo, String var) {
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < tabelaSimb.size() - 2; i++) {
            a = (ArrayList<String>) tabelaSimb.get(i);
            if (a.get(0).equals(var)) {
                a = (ArrayList<String>) tabelaSimb.get(i - 1);
                String val = a.get(0);
                if (val.equals("str") || val.equals("double") || val.equals("int") || val.equals("float") || val.equals("boolean")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Verifica a criação das variáveis anteriormente a uma atribuição
     *
     * @param var String
     * @return Boolean
     */
    public boolean verificaVar(String var) {
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < tabelaSimb.size() - 2; i++) {
            a = (ArrayList<String>) tabelaSimb.get(i);
            if (a.get(0).equals(var)) {
                a = (ArrayList<String>) tabelaSimb.get(i - 1);
                String val = a.get(0);
                if (val.equals("str") || val.equals("double") || val.equals("int") || val.equals("float") || val.equals("boolean")) {
                    tipoAt = val; //Atribui o tipo na variável global para verificação posterior após término da atribuição da expressão
                    a = (ArrayList<String>) tabelaSimb.get(i);
                    a.set(3, tipoAt);
                    tabelaSimb.set(i, a);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método responsável por analisar se as atribuições estão corretas
     *
     * @return Boolean
     */
    public boolean verificaTipo() {
        String val = "";
        ArrayList<String> a = new ArrayList();
        boolean aux = false;
        String atribuicao = "";
        for (int i = tabelaSimb.size() - at; i < tabelaSimb.size(); i++) {
            a = (ArrayList<String>) tabelaSimb.get(i);
            val = a.get(0);
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
                                    if (verificaVariavelCriada(val)) {
                                        aux = true;
                                    } else {
                                        System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo int!");
                                        return false;
                                    }
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
                        if (verificaVariavelCriada(val)) {
                            aux = true;
                        } else {
                            System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo real!");
                            return false;
                        }
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
                            || val.equals(">=") || val.equals("<=")
                            || val.equals("==") || val.equals("||")
                            || val.equals("&&") || val.equals("!") || val.equals("<>")) {
                        aux = true;
                    }
                }
                //String qualquer
                if (tipoAt.equals("str")) {
                    aux = val.matches("[A-z]+([a-zA-Z][0-9]+|_)+");
                    if (aux) {
                        aux = true;
                    } else {
                        if (verificaVariavelCriada(val)) {
                            aux = true;
                        } else {
                            System.out.println("Erro semântico simbolo incompatível " + val + " com o tipo str!");
                            return false;
                        }
                    }
                }
            }
            atribuicao = atribuicao.concat(val);
        }
        a = (ArrayList<String>) tabelaSimb.get(tabelaSimb.size()-at-2);
        a.set(3, tipoAt);
        a.set(4, atribuicao);
        tabelaSimb.set(tabelaSimb.size()-at-2, a);
        tipoAt = "";
        at = 0;
        return aux;
    }

    /**
     * Método que verifica se a atribuição é um número válido
     *
     * @param palavra String
     * @return Boolean
     */
    public boolean verificarNumeroValido(String palavra) {
        boolean retorno = false;
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
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
        if (cont > 1) {
            retorno = false;
        }
        return retorno;
    }

    /**
     * Método para verificar se String é real
     *
     * @param palavra
     * @return Boolean
     */
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

    /**
     * Método responsável por verificar se variável de um tipo já foi criada e
     * possui atribuição, para assim atribuir a outra
     *
     * @param id String
     * @return Boolean
     */
    public boolean verificaVariavelCriada(String id) {
        String val = "";
        String val2 = "";
        if(!id.equals(";")){
        int cont = 0;
        ArrayList<String> a = new ArrayList();
        ArrayList<String> a2 = new ArrayList();
        for (int i = 1; i < tabelaSimb.size() - 1; i++) {
            a = (ArrayList<String>) tabelaSimb.get(i);
            a2 = (ArrayList<String>) tabelaSimb.get(i - 1);
            val = a.get(0);
            val2 = a2.get(0);
            if (val.equals(id) && val2.equals(tipoAt)) {
                cont++;
            }
            if (val2.equals(id) && val.equals("=")) {
                cont++;
            }
        }
        if (cont > 1) {
            return true;
        } else {
            if (cont == 0) {
                System.out.println("Variável " + id + " não criada!");
            }
            if (cont == 1) {
                System.out.println("Variável " + id + " não possui valor atribuído!");
            }
            return false;
        }
        }
        return true;
    }
}
