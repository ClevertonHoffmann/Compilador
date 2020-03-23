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
       
        //Estado 0 - id OK
        h2.put("id", "s3");
        ACTION.add(h2);
        
        //Estado 1 - Estado de Aceitação OK
        h2 = new HashMap();
        h2.put("$", "acc");
        ACTION.add(h2);
        
        //Estado 2 - ap OK
        h2 = new HashMap();
        h2.put("ap","s4");
        ACTION.add(h2);
        
        //Estado 3 - dp OK
        h2 = new HashMap();
        h2.put("dp", "s5");
        ACTION.add(h2);
        
        //Estado 4 - <LISTA_PAR> OK
        h2 = new HashMap();
        h2.put("int","s8");
        h2.put("str", "s8");
        h2.put("double", "s8");
        h2.put("float", "s8");
        h2.put("boolean", "s8");
        ACTION.add(h2);
        
        //Estado 5 - begin - OK
        h2 = new HashMap();
        h2.put("begin","s14"); 
               
        ACTION.add(h2);
        
        //Estado 6 - <LISTA_PAR> - OK
        h2 = new HashMap();
        h2.put("fp","s15");
        ACTION.add(h2);
        
        //Estado 7 - <VAR> - OK
        h2 = new HashMap();
        h2.put("int","s9");
        h2.put("str", "s10");
        h2.put("double", "s11");
        h2.put("float", "s12");
        h2.put("boolean", "s13");
        h2.put("id", "s17");
        h2.put("fp", "r0");
        ACTION.add(h2);
        
        //Estado 8 - <TIPO> - OK
        h2 = new HashMap();
        h2.put("id","s17");
        ACTION.add(h2);
        
        //Estado 9 - int - OK
        h2 = new HashMap();
        h2.put("id","r2");
        ACTION.add(h2);
        
        //Estado 10 - str - OK
        h2 = new HashMap();
        h2.put("id","r2");
        ACTION.add(h2);
        
        //Estado 11 - double - OK
        h2 = new HashMap();
        h2.put("id","r2");
        ACTION.add(h2);
        
        //Estado 12 - float - OK
        h2 = new HashMap();
        h2.put("id","r2");
        ACTION.add(h2);
        
        //Estado 13 - boolean - OK
        h2 = new HashMap();
        h2.put("id","r2");
        ACTION.add(h2);
        
        //Estado 14 - ap - OK
        h2 = new HashMap();
        h2.put("ap","r2");
     
        ACTION.add(h2);
        
        //Estado 15 - fp - OK
        h2 = new HashMap();
        h2.put("ac","s18");
        ACTION.add(h2);
        
        //Estado 16 - <VAR> <LISTA_PAR> - OK
        h2 = new HashMap();
        h2.put("fp","r0");
        ACTION.add(h2);
        
        //Estado 17 - pv - OK
        h2 = new HashMap();
        h2.put("pv","s19");
        ACTION.add(h2);
        
        //Estado 18 - fc 
        h2 = new HashMap();
        h2.put("int","r0");
        h2.put("str","r0");
        h2.put("double","r0");
        h2.put("float","r0");
        h2.put("boolean","r0");
        h2.put("id","r0");
        h2.put("while","r0");
        h2.put("for","r0");
        h2.put("if","r0");
        h2.put("else","r0");
        
        ACTION.add(h2);
        
        //Estado 19 - pv 
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("fc","r3");
        h2.put("int","r3");
        h2.put("str","r3");
        h2.put("double","r3");
        h2.put("float","r3");
        h2.put("boolean","r3");
        
        ACTION.add(h2);
        
        //Estado 20
        h2 = new HashMap();
        h2.put("int","s8");
        h2.put("str","s8");
        h2.put("double","s8");
        h2.put("float","s8");
        h2.put("boolean","s8");
        
        
        
        
        
        
        h2.put("v", "s30");
        h2.put("fc","s31");
        ACTION.add(h2);
        
        //Estado 21 
        h2 = new HashMap();
        h2.put("const","s34");
        h2.put("id","s35");
        h2.put("real","s36"); 
        h2.put("pv", "r0");
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
        
        //Estado 27
        h2 = new HashMap();
        h2.put("end","r4");
        ACTION.add(h2);
        
        //Estado 28
        h2 = new HashMap();
        h2.put("fc","r2");
        ACTION.add(h2);
        
        //Estado 29 - OK
        h2 = new HashMap();
        h2.put("fc","r2");
        ACTION.add(h2);
        
        //Estado 30 - OK
        h2 = new HashMap(); 
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
        //Estado 31
        h2 = new HashMap();
        h2.put("end","r0");
        ACTION.add(h2);
        
        //Estado 32
        h2 = new HashMap();
        h2.put("pv","s43");
        ACTION.add(h2);
        
        //Estado 33 
        h2 = new HashMap();
        h2.put("pv", "r0");
        h2.put("soma","s45");
        h2.put("mult","s46");
        h2.put("div","s47");
        h2.put("subt","s48");
        ACTION.add(h2);
        
         //Estado 34
        h2 = new HashMap();
        h2.put("pv","r1");
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("sub","r1");
        h2.put("mult","r1");
        ACTION.add(h2);
        
        //Estado 35
        h2 = new HashMap();
        h2.put("pv","r1");
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("sub","r1");
        h2.put("mult","r1");
        ACTION.add(h2);
        
        //Estado 36
        h2 = new HashMap();
        h2.put("pv","r1");
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("sub","r1");
        h2.put("mult","r1");
        ACTION.add(h2);
        
         //Estado 37
        h2 = new HashMap();
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
        //Estado 38
        h2 = new HashMap();
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
        //Estado 39
        h2 = new HashMap();
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
         //Estado 40
        h2 = new HashMap();
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
        //Estado 41
        h2 = new HashMap();
        h2.put("id","s20");
        h2.put("at","s20");
        ACTION.add(h2);
        
        //Estado 42 - OK
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 43 - OK 
        h2 = new HashMap();
        h2.put("id","r5");////////////////////VER REDUÇÕES
        h2.put("fc","r6");
        ACTION.add(h2);
        
        //Estado 44
        h2 = new HashMap();
        h2.put("pv","r0");
        ACTION.add(h2);
        
        //Estado 45     
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 46     
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 47      
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 48      
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 49      
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 50
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 51
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 52
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 53
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 54
        h2 = new HashMap();
        h2.put("$","r13");
        ACTION.add(h2);
        
        //Estado 55
        h2 = new HashMap();
        h2.put("end","s54");
        ACTION.add(h2);
        
        //Estado 56
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 57
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 58
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 59
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 60
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 61
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 62
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 63
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 64
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 65
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
    }
    
    public void tabelaGOTO(){
        
        GOTO.put( 0, 1);//ok
        GOTO.put( 3, 2);//ok
        GOTO.put( 4, 7);//ok
        GOTO.put( 7,16);//ok
        GOTO.put(16, 6);//ok
        GOTO.put(18,20);
        GOTO.put(20,20);
        GOTO.put(31,55);
        //GOTO.put(55,54);
     //   GOTO.put(55,54);
//        GOTO.put(4,  7);
//        GOTO.put(5,  9);
//        GOTO.put(18, 26); //32 -31
//        GOTO.put(10, 19);
//        GOTO.put(30, 42);
//        GOTO.put(21, 33);
//        GOTO.put(33, 44);
//        GOTO.put(44, 32);

    }

    public ArrayList  <HashMap> getACTION() {
        return ACTION;
    }

    public HashMap<Integer, Integer> getGOTO() {
        return GOTO;
    }
    
    
}
