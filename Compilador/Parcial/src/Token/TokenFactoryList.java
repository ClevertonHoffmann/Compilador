package Token;

import java.util.ArrayList;

/**
 * Classe responsável por fabricar a lista de Tokens
 * @author Cleverton
 */
public class TokenFactoryList{
    
    private ArrayList<InterfaceFlyweight> listatokens;
        
    public TokenFactoryList() {
        listatokens = new ArrayList<InterfaceFlyweight>();
       // listatokens.add(new Flyweight(" "," ",0));
    }

    public void setListatokens(String t, String l, int p) {
        this.listatokens.add(p , new Flyweight(t,l,p));
    }    
    
    public ArrayList<InterfaceFlyweight> getListatokens() {
        return listatokens;
    }    
    
}
