/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SintaticoAscendente;
import Token.TokenFactoryList;
import java.util.Hashtable;
import java.util.Stack;

/**
 *
 * @author Cleverton
 */
public class Sintatico {
    
    private TabelasGOTOeACTION t;
    Stack p = new Stack();
    TokenFactoryList listaTok;
    
    public Sintatico(TokenFactoryList to){
        this.t = new TabelasGOTOeACTION();
        this.listaTok = to;
    }
    
    public boolean analisador(){
        p.push("$");
        p.push(0);
        int i = 0;
        while(true){
            try{
                if(((String) t.getACTION().get(
                        (int)p.peek() //pega o último elemento da pilha
                        ).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                        )).substring(0, 1).equals("s")){ //Shift
                    
                   p.push(Integer.parseInt(((String) t.getACTION().get((int)p.peek()).get( //empilha na pilha
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                        )).substring(1, 2)));
                   i++;
                }else if(((String) t.getACTION().get((int)p.peek()).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                        )).substring(0, 1).equals("r")){ //reduce
                    
                    int aux = Integer.parseInt(((String) t.getACTION().get((int)p.peek()).get(
                            listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                            )).substring(1, 2));
                    for(int j = 0; j<aux; j++){
                        p.pop();
                    }
                    p.push(t.getGOTO().get((int)p.peek()));
                    
                }else if (((String) t.getACTION().get((int)p.peek()).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                        )).equals("acc")){ //fim da gramática
                    System.out.println("Linguagem aceita");
                    return true;
                    
                }else{
                    System.out.println("Erro");
                    return false;
                }               
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Linguagem não aceita");
                return false;
            }     
        }
    }
    
}
