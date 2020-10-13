/*
 * 
 */
package Token;

/**
 * Classe que armazena as informações do Token
 * tok = valor do token
 * lex = lexema
 * pos = posição
 * @author Cleverton
 */
public class Token {
    
    protected String tok;
    protected String lex;
    protected int pos;
        
    public Token(String t, String l, int p){
        this.tok = t;
        this.lex = l;
        this.pos = p;
    }
    
    public Token Token(String t1, String l1, int p1){
        Token t = new Token(t1,l1,p1);
        return t;
    }
    
    public String getTok() {
        return tok;
    }

    public void setTok(String tok) {
        this.tok = tok;
    }

    public String getLex() {
        return lex;
    }

    public void setLex(String lex) {
        this.lex = lex;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }   

    @Override
    public String toString() {
        return "Token{" + "tok=" + tok + ", lex=" + lex + ", pos=" + pos + '}';
    }       
}
