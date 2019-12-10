/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SintaticoAscendente;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Cleverton
 */
public class TabelasGOTOeACTION {

    private ArrayList<HashMap> ACTION;
    private HashMap<Integer, Integer> GOTO;

    public TabelasGOTOeACTION() {
        this.ACTION = new ArrayList();
        this.GOTO = new HashMap();
        this.tabelaACTION();
        this.tabelaGOTO();
    }
   
    public void tabelaACTION(){
        HashMap<String, String> h2 = new HashMap(); 
       
        h2.put("a", "s2");
        h2.put("c", "s3");
        ACTION.add(h2);
        
        h2 = new HashMap();
        h2.put("$", "acc");
        ACTION.add(h2);
        
        h2 = new HashMap();
        h2.put("a", "s2");
        h2.put("c", "s3");
        ACTION.add(h2);
        
        h2 = new HashMap();
        h2.put("b", "r1");
        ACTION.add(h2);
        
        h2 = new HashMap();
        h2.put("b", "s5");
        ACTION.add(h2);
        
        h2 = new HashMap();
        h2.put("$", "r3");
        h2.put("b", "r3");
        ACTION.add(h2);
        
    }
    
    public void tabelaGOTO(){
        
        GOTO.put(0, 1);
        GOTO.put(2, 4);
        
    }

    public ArrayList  <HashMap> getACTION() {
        return ACTION;
    }

    public HashMap<Integer, Integer> getGOTO() {
        return GOTO;
    }
    
    
}
