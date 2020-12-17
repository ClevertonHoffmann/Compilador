///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package SintaticoAscendente;
//
//import java.util.ArrayList;
//
///**
// *
// * @author Cleverton
// */
//public class Arvore {
//
//    private String tipo;
//    private String acao;
//    private String tok;
//    private String lex;
//    private int nivelArvore;
//    private String tipoDeNo;
//    private ArrayList<Arvore> filho;
//
//    public Arvore() {
//        
//    }
//
//    public Arvore insereNo(String tipo, String acao, String tok, String lex, int nivel, String no) {
//        if (no.equals("Raiz")) {
//            this.setTipo(tipo);
//            this.setAcao(acao);
//            this.setTok(tok);
//            this.setLex(lex);
//            this.setNivelArvore(nivel);
//            this.setTipoDeNo(no);
//            this.setFilho(new ArrayList<Arvore>());
//        }else{
//            if(no.equals("folha")){
//                Arvore a = new Arvore();
//                a.setTipo(tipo);
//                a.setAcao(acao);
//                a.setTok(tok);
//                a.setLex(lex);
//                a.setNivelArvore(nivel);
//                a.setTipoDeNo(no);
//                a.setFilho(new ArrayList<Arvore>());
//                this.filho.get(0).filho.add(a);
//            }
//            if(no.equals("galho")){
//                Arvore a = new Arvore();
//                a.setTipo(tipo);
//                a.setAcao(acao);
//                a.setTok(tok);
//                a.setLex(lex);
//                a.setNivelArvore(nivel);
//                a.setTipoDeNo(no);
//                a.setFilho(new ArrayList<Arvore>());
//                this.filho.add(a);
//            }
//        }
//        return this;
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public String getAcao() {
//        return acao;
//    }
//
//    public void setAcao(String acao) {
//        this.acao = acao;
//    }
//
//    public String getTok() {
//        return tok;
//    }
//
//    public void setTok(String tok) {
//        this.tok = tok;
//    }
//
//    public String getLex() {
//        return lex;
//    }
//
//    public void setLex(String lex) {
//        this.lex = lex;
//    }
//
//    public int getNivelArvore() {
//        return nivelArvore;
//    }
//
//    public void setNivelArvore(int nivelArvore) {
//        this.nivelArvore = nivelArvore;
//    }
//
//    public String getTipoDeNo() {
//        return tipoDeNo;
//    }
//
//    public void setTipoDeNo(String tipoDeNo) {
//        this.tipoDeNo = tipoDeNo;
//    }
//
//    public ArrayList<Arvore> getFilho() {
//        return filho;
//    }
//
//    public void setFilho(ArrayList<Arvore> filho) {
//        this.filho = filho;
//    }
//
//}
