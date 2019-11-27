/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SintaticoAscendente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Cleverton
 */
public class TabelasGOTOeACTION {

    private HashMap<String, String> h2; 
    private HashMap<Integer, HashMap> ACTION;
    private HashMap<Integer, Integer> GOTO;

    public TabelasGOTOeACTION() {
        this.h2 = new HashMap();
        this.ACTION = new HashMap();
        this.GOTO = new HashMap();
        this.tabelaACTION();
        this.tabelaGOTO();
    }
   
    public void tabelaACTION(){

        h2.put("a", "s2");
        h2.put("c", "s3");
        ACTION.put(0,h2);
         
        h2.clear();
        h2.put("$", "acc");
        ACTION.put(1,h2);
        
        h2.clear();
        h2.put("a", "s2");
        h2.put("c", "s3");
        ACTION.put(2,h2);
        
        h2.clear();
        h2.put("b", "r1");
        ACTION.put(3,h2);
        
        h2.clear();
        h2.put("b", "s5");
        ACTION.put(4,h2);
        
        h2.clear();
        h2.put("$", "r3");
        h2.put("b", "r3");
        ACTION.put(5, h2);
        
    }
    
    public void tabelaGOTO(){
        
        GOTO.put(0, 1);
        GOTO.put(2, 4);
        
    }

    public HashMap<Integer, HashMap> getACTION() {
        return ACTION;
    }

    public HashMap<Integer, Integer> getGOTO() {
        return GOTO;
    }
    
    
}
