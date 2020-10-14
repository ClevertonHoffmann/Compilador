    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import Token.TokenFactoryList;
import java.util.ArrayList;

/**
 *
 * @author Cleverton
 */
public class Lexico {
    
    private TokenFactoryList t;
    private TabelaDeTransicao tab;
    private String[] separado;
    private int count;
    private StringBuilder build; 
    private int q;
    private int qntTokens;
    
    public Lexico(String texto){
         this.tab = new TabelaDeTransicao();
         this.separado = texto.split("");
         this.count = this.separado.length;
         this.build = new StringBuilder();
         this.q = 0;
         this.qntTokens = 0;
         this.t = new TokenFactoryList();
    }
        
    public ArrayList iniciaAnalise(){
        int k = 0;
        while (count>0){
            try{
            //Aceita o caractere e avança uma posição na entrada
            if(!tab.getT().get(q).get(separado[k]).equals(-1)){ 
                build.append(separado[k]);//Concatena os caracteres até formar um token
                q = (int) tab.getT().get(q).get(separado[k]);  //Seta o estado presente na tabela
                count--;
                k++;                
            //Aceita o Token
            }else if(!tab.getTs().get(q).equals("?")){  
                if(!build.toString().equals(" ")){ //Não salva os espaços na lista de tokens      
                   if(tab.getpReservada().containsValue(build.toString())){ //Verifica se contém palavra reservada
                       t.setListatokens(build.toString(), build.toString(), qntTokens);
//                       System.out.println("Estado: ".concat(String.valueOf(q))
//                            .concat(" Posição: ".concat(String.valueOf(k)))
//                            .concat(" Token: ").concat(build.toString())
//                            .concat(" Lexema: ").concat(build.toString()));
                   }else{
                       t.setListatokens(tab.getTs().get(q), build.toString(), qntTokens);
//                       System.out.println("Estado: ".concat(String.valueOf(q))
//                            .concat(" Posição: ".concat(String.valueOf(k)))
//                            .concat(" Token: ").concat(tab.getTs().get(q))
//                            .concat(" Lexema: ").concat(build.toString()));
                   }                 
                qntTokens++;
                }
                this.build = new StringBuilder();
                q = 0;
            //Regeita caractere não identificado 
            }else{ 
//                System.out.println("Estado: ".concat(String.valueOf(q))
//                                    .concat(" Posição: ").concat(String.valueOf(k))
//                                    .concat(" Token: ").concat("Erro Léxico")
//                                    .concat(" Lexema: ").concat(separado[k]).concat("Caractere não esperado"));
                count--;
                k++;
            }
            } catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Estado não encontrado");
                break;
            }
        }
        
        return t.getListatokens();
        
    }
    
    public TokenFactoryList getT() {
        return t;
    }

    public void setT(TokenFactoryList t) {
        this.t = t;
    }
}