
import SintaticoAscendente.GeradorArvoreSintatica;
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
      
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o código a ser analisado!");
    String texto = read.nextLine();
    texto = texto + " ";
    Lexico l = new Lexico(texto);
    l.iniciaAnalise();
    System.out.println(l.getT().getListatokens());
    Sintatico s = new Sintatico(l.getT());
    s.analisador();
    
    
    }
    
}
