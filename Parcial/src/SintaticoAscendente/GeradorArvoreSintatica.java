///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package SintaticoAscendente;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
///**
// *
// * @author Cleverton
// */
//public class GeradorArvoreSintatica {
//   
//    private Arvore A; //Árvore de derivação
//    private Stack t; //Tabela de símbolos
//    private int n; //Nível da Árvore
//    private int i; //Número de elementos já consumidos da tabela de símbolos
//    
//    public GeradorArvoreSintatica(Stack t){
//        this.A = new Arvore();
//        this.t = t;
//        this.n = 0;
//        this.i = 0;
//    }
//    
//    /**
//     * Gera a árvore de derivação
//     * @return 
//     */
//    public boolean geraCodigo(){
//        
//        //lex, pos, tok, tip, exp
//        ArrayList<String> tab = (ArrayList<String>) t.get(0);
//        //tipo-pai-tok-lex-nível-nó
//        A = A.insereNo("s-inicial-gramatica", "-", "<S>", "<S>", n, "Raiz");
//        this.n++;
//        
////        for (int i = 0; i<tab.size(); i++){
////            
//        if (inicio(1) && sac(1) && listapar(1) && sfp(1) && sac(1) && codigo(1) && fim(1)) {
//
//        }
//        
//        return true;
//    }
//
//    private boolean inicio(int p) {
//        A = A.insereNo("nao-terminal", "<S>", "<INICIO>", "<INICIO>", p, "galho");
//        ArrayList<String> tab = (ArrayList<String>) t.get(0);
//        A = A.insereNo("terminal", "<INICIO>", tab.get(2), tab.get(0), p+1, "folha");
//        tab = (ArrayList<String>) t.get(1);
//        A = A.insereNo("terminal", "<INICIO>", tab.get(2), tab.get(0), p+1, "folha");
//        tab = (ArrayList<String>) t.get(2);
//        A = A.insereNo("terminal", "<INICIO>", tab.get(2), tab.get(0), p+1, "folha");
//        i = i+3;
//        return true;
//    }
//
//    private boolean sac(int p) {
//        ArrayList<String> tab = (ArrayList<String>) t.get(i);
//        i++;
//        A = A.insereNo("terminal", "<S>", tab.get(2), tab.get(0), p, "galho");//VERIFICAR NÃO É GALHO É FOLHA
//        return true;
//    }
//
//    private boolean listapar(int i) {
//        
//        return true;
//    }
//
//    private boolean sfp(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private boolean codigo(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private boolean fim(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}
