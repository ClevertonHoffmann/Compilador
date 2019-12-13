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
       
        //Estado 0 - id
        h2.put("id", "s3");
        ACTION.add(h2);
        
        //Estado 1 - Estado de Aceitação
        h2 = new HashMap();
        h2.put("$", "acc");
        ACTION.add(h2);
        
        //Estado 2 - <INICIO>
        h2 = new HashMap();
        h2.put("end","r0");
        h2.put("ac", "s5");
        
       // h2.put("id", "r");/////////////////
       // h2.put("fc", "r");////////////////
       // h2.put("if", "r");////////////////
       // h2.put("else", "r");////////////////
       // h2.put("while", "r");////////////////
       // h2.put("for", "r");////////////////
        ACTION.add(h2);
        
        //Estado 3 - id - OK
        h2 = new HashMap();
        h2.put("dp", "s6");
        ACTION.add(h2);
        
        //Estado 4 - <CODIGO> - OK
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 5 - ac
        h2 = new HashMap();
        h2.put("fc","r0"); 
        h2.put("id","s10");
        
        
        h2.put("if","s13");
        h2.put("else","s14");
        h2.put("while","s15");
        h2.put("for","s16");
        
        ACTION.add(h2);
        
        //Estado 6 - dp
        h2 = new HashMap();
        h2.put("begin","s17");
        ACTION.add(h2);
        
        //Estado 7 - <FIM> - OK
        h2 = new HashMap();
        h2.put("end","s8");
        ACTION.add(h2);
        
        //Estado 8 - END - OK
        h2 = new HashMap();
        h2.put("$","r7");
        ACTION.add(h2);
        
        //Estado 9 - <BLOCO> - OK
        h2 = new HashMap();
        h2.put("fc","s18");
        ACTION.add(h2);
        
        //Estado 10  ///INICIANDO ANALISE
        h2 = new HashMap();
        h2.put("id","s20");
        
        h2.put("at","s21");
        ACTION.add(h2);
        
        //Estado 11
        h2 = new HashMap();
       // h2.put("fc","r");////////////
        ACTION.add(h2);
        
        //Estado 12
        h2 = new HashMap();
       // h2.put("fc","r");///////////
        ACTION.add(h2);
        
        //Estado 13
        h2 = new HashMap();
        h2.put("ap","s22");
        ACTION.add(h2);
        
        //Estado 14
        h2 = new HashMap();
     //   h2.put("id","r");
        h2.put("ac","s5");
     //   h2.put("fc","r");////////////////////
       // h2.put("if", "r");////////////////
       // h2.put("else", "r");////////////////
       // h2.put("while", "r");////////////////
       // h2.put("end", "r");////////////////
       // h2.put("for", "r");////////////////
        ACTION.add(h2);
        
        //Estado 15
        h2 = new HashMap();
        h2.put("ap","s24");
        ACTION.add(h2);
        
        //Estado 16
        h2 = new HashMap();
        h2.put("ap","s25");
        ACTION.add(h2);
        
        //Estado 17 - begin - OK
        h2 = new HashMap();
        h2.put("end","r0");
        h2.put("ac", "r0");
        ACTION.add(h2);
        
        //Estado 18 - fc - OK
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 19
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 20
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 21
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 22
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 23
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 24
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 25
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 26 - <CODIGO> - OK
        h2 = new HashMap();
        h2.put("end","r4");
        ACTION.add(h2);
    }
    
    public void tabelaGOTO(){
        
        GOTO.put(0, 1);
        GOTO.put(17,2);
        GOTO.put(2, 4);
        GOTO.put(4, 7);
        GOTO.put(5, 9);
        GOTO.put(18,26);
        
    }

    public ArrayList  <HashMap> getACTION() {
        return ACTION;
    }

    public HashMap<Integer, Integer> getGOTO() {
        return GOTO;
    }
    
    
}
