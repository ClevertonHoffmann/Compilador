/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SintaticoAscendente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

/**
 *
 * @author Cleverton
 */
public class TabelasGOTOeACTION {

    private ArrayList<HashMap> ACTION;
    private HashMap[] GOTO;

    public TabelasGOTOeACTION() {
        this.ACTION = new ArrayList();
        this.GOTO = new HashMap[200];
        this.tabelaACTION();
        this.tabelaGOTO();
    }
   
    public void tabelaACTION(){
        HashMap<String, String> h2 = new HashMap(); 
       
        //Estado 0 - id - OK
        h2.put("id", "s3");
        ACTION.add(h2);
        
        //Estado 1 - Estado de Aceitação - OK 
        h2 = new HashMap();
        h2.put("$", "acc");
        ACTION.add(h2);
        
        //Estado 2 - ap - OK
        h2 = new HashMap();
        h2.put("ap","s4");
        ACTION.add(h2);
        
        //Estado 3 - dp - OK
        h2 = new HashMap();
        h2.put("dp", "s5");
        ACTION.add(h2);
        
        //Estado 4 - <LISTA_PAR> 
        h2 = new HashMap();
        h2.put("int","s9");
        h2.put("str", "s10");
        h2.put("double", "s11");
        h2.put("float", "s12");
        h2.put("boolean", "s13");
        ACTION.add(h2);
        
        //Estado 5 - begin
        h2 = new HashMap();
        h2.put("begin","s14"); 
               
        ACTION.add(h2);
        
        //Estado 6 - <LISTA_PAR> 
        h2 = new HashMap();
        h2.put("fp","s15");
        ACTION.add(h2);
        
        //Estado 7 - <VAR>
        h2 = new HashMap();
        h2.put("int","s9");
        h2.put("str", "s10");
        h2.put("double", "s11");
        h2.put("float", "s12");
        h2.put("boolean", "s13");
        h2.put("fp", "r1");
        h2.put("fc", "r1");
        h2.put("id", "r1");
        ACTION.add(h2);
        
        //Estado 8 - <TIPO> - OK
        h2 = new HashMap();
        h2.put("id","s17");
        ACTION.add(h2);
        
        //Estado 9 - int - OK
        h2 = new HashMap();
        h2.put("id","r1");
        ACTION.add(h2);
        
        //Estado 10 - str - OK
        h2 = new HashMap();
        h2.put("id","r1");
        ACTION.add(h2);
        
        //Estado 11 - double - OK
        h2 = new HashMap();
        h2.put("id","r1");
        ACTION.add(h2);
        
        //Estado 12 - float - OK
        h2 = new HashMap();
        h2.put("id","r1");
        ACTION.add(h2);
        
        //Estado 13 - boolean - OK
        h2 = new HashMap();
        h2.put("id","r1");
        ACTION.add(h2);
        
        //Estado 14 - ap - OK
        h2 = new HashMap();
        h2.put("ap","r3");
     
        ACTION.add(h2);
        
        //Estado 15 - fp
        h2 = new HashMap();
        h2.put("ac","s18");
        ACTION.add(h2);
       
        //Estado 16 - <VAR> <LISTA_PAR> 
        h2 = new HashMap();
        h2.put("fp","r1");
        ACTION.add(h2);
        
        //Estado 17 - pv - OK
        h2 = new HashMap();
        h2.put("pv","s19");
        ACTION.add(h2);
        
        //Estado 18 - <BLOCO> 
        h2 = new HashMap();
        h2.put("int","s9");
        h2.put("str", "s10");
        h2.put("double", "s11");
        h2.put("float", "s12");
        h2.put("boolean", "s13");
        h2.put("fc", "r1");
        h2.put("id","s26");
        h2.put("while","s27");
        h2.put("for","s28");
        h2.put("if","s29");
        h2.put("else","s30");
        
        ACTION.add(h2);
        
        //Estado 19 - pv  - OK
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("fc","r3");
        h2.put("int","r4");
        h2.put("str","r4");
        h2.put("double","r4");
        h2.put("float","r4");
        h2.put("boolean","r4");
        h2.put("id","r4");
        ACTION.add(h2);
        
        //Estado 20
        h2 = new HashMap();
//        h2.put("int","s8");
//        h2.put("str","s8");
//        h2.put("double","s8");
//        h2.put("float","s8");
//        h2.put("boolean","s8");
//        h2.put("v", "s30");
        h2.put("fc","s31");
        ACTION.add(h2);
        
        //Estado 21 
        h2 = new HashMap();
        h2.put("fc","r1");
//        h2.put("const","s34");
//        h2.put("id","s35");
//        h2.put("real","s36"); 
//        h2.put("pv", "r0");
        ACTION.add(h2);
        
        //Estado 22
        h2 = new HashMap();
        h2.put("fc","r1");
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
        
        //Estado 26 - <id>
        h2 = new HashMap();
        h2.put("at","s33");
        h2.put("inc","s34");
        h2.put("dec","s35");
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
        h2.put("end","s55");
        ACTION.add(h2);
        
        //Estado 32
        h2 = new HashMap();
        h2.put("pv","s43");
        ACTION.add(h2);
        
        //Estado 33 
        h2 = new HashMap();
        //h2.put("pv", "r0");
//       h2.put("soma","s45");
//        h2.put("mult","s46");
//        h2.put("div","s47");
//        h2.put("subt","s48");
        h2.put("id","s49");
        h2.put("const","s48");
        h2.put("real","s50");
        h2.put("ap","s61");
        ACTION.add(h2);
        
         //Estado 34
        h2 = new HashMap();
        h2.put("pv","s63");
//        h2.put("soma","r1");
//        h2.put("div","r1");
//        h2.put("sub","r1");
//        h2.put("mult","r1");
        ACTION.add(h2);
        
        //Estado 35
        h2 = new HashMap();
        h2.put("pv","s64");
//        h2.put("soma","r1");
//        h2.put("div","r1");
//        h2.put("sub","r1");
//        h2.put("mult","r1");
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
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("fp","r1");
        h2.put("fc","r1");
        h2.put("pv","r1");  
        h2.put("dif","r1");
        h2.put("not","r1");
        h2.put("e","r1");
        h2.put("ou","r1");
        h2.put("igual","r1");
        h2.put("maiorig","r1");
        h2.put("menorig","r1");
        h2.put("menor","r1");
        h2.put("maior","r1");
        ACTION.add(h2);
        
        //Estado 49 - id
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("fp","r1");
        h2.put("fc","r1");
        h2.put("pv","r1");  
        h2.put("dif","r1");
        h2.put("not","r1");
        h2.put("e","r1");
        h2.put("ou","r1");
        h2.put("igual","r1");
        h2.put("maiorig","r1");
        h2.put("menorig","r1");
        h2.put("menor","r1");
        h2.put("maior","r1");
        ACTION.add(h2);
        
        //Estado 50
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("fp","r1");
        h2.put("fc","r1");
        h2.put("pv","r1");  
        h2.put("dif","r1");
        h2.put("not","r1");
        h2.put("e","r1");
        h2.put("ou","r1");
        h2.put("igual","r1");
        h2.put("maiorig","r1");
        h2.put("menorig","r1");
        h2.put("menor","r1");
        h2.put("maior","r1");
        ACTION.add(h2);
        
        //Estado 51
        h2 = new HashMap();
        
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
        
        //Estado 55 - (S)
        h2 = new HashMap();
        h2.put("$","r8");
        ACTION.add(h2);
        
        //Estado 56 <EXP>
        h2 = new HashMap();
        h2.put("soma","s80");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("pv","s79");
        ACTION.add(h2);
        
        //Estado 57 <EXP1>
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","s81");
        h2.put("pv","r1");
        h2.put("fp","r1");
        ACTION.add(h2);
        
        //Estado 58 <EXP2>
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","s82");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("pv","r1");
        h2.put("fp","r1");
        ACTION.add(h2);
        
        //Estado 59 <EXP3>
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","s83");
        h2.put("mult","r1");
        h2.put("pv","r1");
        h2.put("fp","r1");
        ACTION.add(h2);
        
        //Estado 60 <EXP4>
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("pv","r1");
        h2.put("fp","r1");
        ACTION.add(h2);
        
        //Estado 61
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("id","s49");////////
        h2.put("const","s48");/////
        h2.put("real","s50");///////
        h2.put("ap","s61");//////
        ACTION.add(h2);
        
        //Estado 62 <AUX>
        h2 = new HashMap();
        h2.put("soma","r1");
        h2.put("div","r1");
        h2.put("subt","r1");
        h2.put("mult","r1");
        h2.put("pv","r1");
        h2.put("fp","r1");//////
        ACTION.add(h2);
        
        //Estado 63
        h2 = new HashMap();
        h2.put("fc","r3");
        h2.put("int","r4");
        h2.put("str", "r4");
        h2.put("double", "r4");
        h2.put("float", "r4");
        h2.put("boolean", "r4");
        h2.put("id","r4");
//        h2.put("while","r4");
//        h2.put("for","r4");
//        h2.put("if","r4");
//        h2.put("else","r4");
        ACTION.add(h2);
        
        //Estado 64
        h2 = new HashMap();
        h2.put("fc","r3");
        h2.put("int","r4");
        h2.put("str", "r4");
        h2.put("double", "r4");
        h2.put("float", "r4");
        h2.put("boolean", "r4");
        h2.put("id","r4");
//        h2.put("while","r4");
//        h2.put("for","r4");
//        h2.put("if","r4");
//        h2.put("else","r4");
        ACTION.add(h2);
        
        //Estado 65
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 66
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 67
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 68
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 69
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 70
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 71
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 72
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 73
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 74
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 75
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 76
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 77
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 78
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 79 - ok
        h2 = new HashMap();
        h2.put("fc","r4");
        h2.put("id","r5");
        h2.put("for","r5");
        h2.put("int","r5");
        h2.put("str","r5");
        h2.put("double","r5");
        h2.put("boolean","r5");
        h2.put("float","r5");
        h2.put("else","r5");
        h2.put("while","r5");
        h2.put("if","r5");
        h2.put("ap","r5");
        h2.put("id","r5");
        h2.put("const","r5");
        h2.put("real","r5");
        ACTION.add(h2);
        
        //Estado 80
        h2 = new HashMap();
        h2.put("const","s48");
        h2.put("ap","s61");
        h2.put("real","s50");
        h2.put("id","s49");
        ACTION.add(h2);
        
        //Estado 81
        h2 = new HashMap();
        h2.put("const","s48");
        h2.put("ap","s61");
        h2.put("real","s50");
        h2.put("id","s49");
        ACTION.add(h2);
        
        //Estado 82
        h2 = new HashMap();
        h2.put("const","s48");
        h2.put("ap","s61");
        h2.put("real","s50");
        h2.put("id","s49");
        ACTION.add(h2);
        
        //Estado 83
        h2 = new HashMap();
        h2.put("const","s48");
        h2.put("ap","s61");
        h2.put("real","s50");
        h2.put("id","s49");
        ACTION.add(h2);
        
        //Estado 84
        h2 = new HashMap();
        h2.put("fc","r3");
        h2.put("fp","s103");
        h2.put("soma","s80");
        ACTION.add(h2);
        
        //Estado 85
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 86
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 87
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 88
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 89
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 90
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("ac","r3");
        h2.put("pv","r3");
        ACTION.add(h2);
        
        //Estado 91
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 92
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 93
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 94
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 95
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 96
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 97
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 98
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 99
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("ac","r3");
        h2.put("pv","r3");
        h2.put("soma","r3");
        h2.put("mult","s81");
        ACTION.add(h2);
        
        //Estado 100
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("pv","r3");
        h2.put("mult","r3");
        h2.put("soma","r3");
        h2.put("div","s82");
        h2.put("subt","r3");
        ACTION.add(h2);
        
        //Estado 101
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("pv","r3");
        h2.put("mult","r3");
        h2.put("soma","r3");
        h2.put("div","r3");
        h2.put("subt","s83");
        ACTION.add(h2);
        
        //Estado 102
        h2 = new HashMap();
        h2.put("fp","r3");
        h2.put("pv","r3");
        h2.put("mult","r3");
        h2.put("soma","r3");
        h2.put("div","r3");
        h2.put("subt","r3");
        ACTION.add(h2);
        
        //Estado 103
        h2 = new HashMap();
        h2.put("fc","r3");
        h2.put("fp","r3");
        h2.put("pv","r3");
        h2.put("mult","r3");
        h2.put("soma","r3");
        h2.put("div","r3");
        h2.put("subt","r3");
        ACTION.add(h2);
        
        //Estado 104
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 105
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 106
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 107
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 108
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 109
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 110
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 111
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 112
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 113
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
        
        //Estado 114
        h2 = new HashMap();
        h2.put("fc","r3");
        ACTION.add(h2);
    }
    
    public void tabelaGOTO(){
        
        HashMap<Integer, Integer> valor = new HashMap();
                
        valor.put(0, 2); //Número atual empilhado na pilha e número a ser empilhado
        GOTO[14] = valor; //Número na pilha anterior ao reduce
        
        valor = new HashMap();
        valor.put(4, 8);
        valor.put(7, 8);
        valor.put(18, 8);
        GOTO[9] = valor;
        
        valor = new HashMap();
        valor.put(4, 8);
        valor.put(7, 8);
        valor.put(18, 8);
        GOTO[10] = valor;
        
        valor = new HashMap();
        valor.put(4, 8);
        valor.put(7, 8);
        valor.put(18, 8);
        GOTO[11] = valor;
        
        valor = new HashMap();
        valor.put(4, 8);
        valor.put(7, 8);
        valor.put(18, 8);
        GOTO[12] = valor;
        
        valor = new HashMap();
        valor.put(4, 8);
        valor.put(7, 8);
        valor.put(18, 8);
        GOTO[13] = valor;

        valor = new HashMap();
        valor.put(4, 16);
        GOTO[7] = valor;
        
        valor = new HashMap();
        valor.put(4, 7);
        valor.put(2, 4);
        valor.put(7, 4);
        valor.put(15, 18);
        valor.put(18, 22);
        GOTO[19] = valor;
        
        valor = new HashMap();
        valor.put(4, 6);
        GOTO[16] = valor;
        
        valor = new HashMap();
        valor.put(18, 21);
        GOTO[22] = valor;
        
        valor = new HashMap();
        valor.put(18, 20);
        GOTO[21] = valor;
        
        valor = new HashMap(); //ACEITACAO
        valor.put(0, 1);
        GOTO[55] = valor;
        
        valor = new HashMap();
        valor.put(18, 22);
        valor.put(15, 18);
        GOTO[63] = valor;
        
        valor = new HashMap();
        valor.put(18, 22);
        valor.put(15, 18);
        GOTO[64] = valor;
        //////////////////
        valor = new HashMap();
        valor.put(33, 62);
        GOTO[49] = valor;
        
        valor = new HashMap();
        valor.put(33, 62);
        valor.put(80, 62);
        valor.put(81, 62);
        valor.put(83, 62);
        valor.put(82, 62);
        valor.put(61, 62);
        GOTO[48] = valor;
        
        valor = new HashMap();
        valor.put(33, 62);
        GOTO[50] = valor;
        
        valor = new HashMap();
        valor.put(33, 62);
        GOTO[61] = valor;
        /////////////////
        valor = new HashMap();
        valor.put(33, 60);
        valor.put(80, 60);
        valor.put(81, 60);
        valor.put(83, 102);
        valor.put(82, 60);
        valor.put(61, 60);
        GOTO[62] = valor;
        
        valor = new HashMap();
        valor.put(33, 59);
        valor.put(80, 59);
        valor.put(81, 59);
        valor.put(82, 101);
        valor.put(61, 59);
        GOTO[60] = valor;
        
        valor = new HashMap();
        valor.put(33, 58);
        valor.put(80, 58);
        valor.put(81, 100);
        valor.put(61, 58);
        GOTO[59] = valor;
        
        valor = new HashMap();
        valor.put(33, 57);
        valor.put(80, 99);
        valor.put(61, 57);
        GOTO[58] = valor;
        
        valor = new HashMap();
        valor.put(33, 57);
        GOTO[56] = valor;
        
        valor = new HashMap();
        valor.put(33, 56);
        valor.put(61, 84);
        GOTO[57] = valor;
        
        valor = new HashMap();
        valor.put(15, 18);
        valor.put(18, 20);
        GOTO[79] = valor;
                
        valor = new HashMap();
        valor.put(33, 56);
        valor.put(61, 62);
        GOTO[99] = valor;
        
        valor = new HashMap();
        valor.put(33, 56);
        valor.put(61, 62);///////////////
        valor.put(18, 26);
        valor.put(80, 99);
        GOTO[100] = valor;
        
        valor = new HashMap();
        valor.put(33, 59);
        valor.put(61, 62);
        valor.put(80, 99);
        valor.put(81, 100);
        valor.put(82, 101);
        GOTO[102] = valor;
        
        valor = new HashMap();
        valor.put(33, 58);
        valor.put(80, 99);
        valor.put(81, 100);
        valor.put(61, 62);
        GOTO[101] = valor;
        
        valor = new HashMap();
        valor.put(33, 58);
        valor.put(61, 62);
        valor.put(80, 99);
        valor.put(81, 100);
        valor.put(82, 101);
        valor.put(83, 62);
        GOTO[103] = valor;
    }

    public ArrayList  <HashMap> getACTION() {
        return ACTION;
    }

    public HashMap[] getGOTO() {
        return GOTO;
    }
    
    
}
