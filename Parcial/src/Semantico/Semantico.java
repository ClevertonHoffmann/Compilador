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
    boolean at;
    
    public boolean acaoSemantica(int p, InterfaceFlyweight tok){
        
        tabelaSimb.add(criaVariavel(tok.getToken().getLex(), Integer.toString(tok.getToken().getPos())));
        
//        System.out.println(p);
//        System.out.println(tok);
//        System.out.println(tabelaSimb);
        //Validadação de declaração de variáveis do tipo int, boolean, double, float e str
        if(tok.getToken().getTok()=="at"){
            HashMap<String, String> a = new HashMap();
            a = (HashMap<String, String>) tabelaSimb.get(tok.getToken().getPos()-1);
            //System.out.println(a.get(""+(tok.getToken().getPos()-1)));
            if(!verificaVar(a.get(""+(tok.getToken().getPos()-1)))){
                System.out.println("Erro semântico a váriável "+a.values()+" não foi definida!");
                return false;
            }
        }
//        else{
//              at=true;
//            at = false;
//        }
        System.out.println(at);
        return true;
    }
    
    //Armazena o lexema e sua posição ao empilhar na análise sintática
    public HashMap criaVariavel(String lex, String pos){
        HashMap<String, String> h2 = new HashMap(); 
        h2.put(pos, lex);
        return h2;
    }
    
    //Verifica a criação das variáveis anteriormente a uma atribuição
    public boolean verificaVar(String var){
        HashMap<String, String> a = new HashMap();
        for (int i = 0; i < tabelaSimb.size()-2; i++){
            a = (HashMap<String, String>) tabelaSimb.get(i);
            if(a.containsValue(var)){
                a = (HashMap<String, String>) tabelaSimb.get(i-1);
                String val = a.get(""+(i-1));
                if (val.equals("str") || val.equals("double") || val.equals("int") || val.equals("float") || val.equals("boolean")){
                    return true;
                }else{
                    return false;
                }
            }            
        }
        return false;
    }
    
}
