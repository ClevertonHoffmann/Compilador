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
    private String[] separado;
    private int count;
    
    public Lexico(String texto){
         this.separado = texto.split("");
         this.count = 0;
    }

    public TokenFactoryList getT() {
        return t;
    }

    public void setT(TokenFactoryList t) {
        this.t = t;
    }
    
    public ArrayList iniciaAnalise(){
        
        
        return t.getListatokens();
    }
    
}
