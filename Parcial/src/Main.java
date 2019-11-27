
import Lexico.Lexico;
import SintaticoAscendente.Sintatico;
import Token.TokenFactoryList;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Token;

/*
 * Classe principal que chama o analisador lexico para início de análise.
 */

/**
 * Main Compilador Parcial
 * @author Cleverton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//	Scanner read = new Scanner(System.in);
//        System.out.println("Digite o código a ser analisado!");
//	String texto = read.nextLine();
//	texto = texto + " ";
//        Lexico l = new Lexico(texto);
//        l.iniciaAnalise();
        
        
        TokenFactoryList t = new TokenFactoryList();
        
        t.setListatokens("a", "", 0);
        t.setListatokens("a", "", 1);
        t.setListatokens("c", "", 2);
        t.setListatokens("b", "", 3);
        t.setListatokens("b", "", 4);
        t.setListatokens("$", "", 5);
                
        Sintatico s = new Sintatico(t);
        s.analisador();
        
    }
    
}
