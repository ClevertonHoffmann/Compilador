/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Token;

/**
 *
 * @author Cleverton
 */
public class Flyweight implements InterfaceFlyweight{
    
    private final Token token;
    
    public Flyweight(String t, String l, int p) {
        this.token = new Token(t,l,p);
    }

    @Override
    public Token getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Flyweight{" + "token=" + token + '}';
    }
    
}
