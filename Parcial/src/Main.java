
import Lexico.Lexico;
import java.util.Scanner;

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
        
        StringBuilder build = new StringBuilder();
	Scanner read = new Scanner(System.in);
        System.out.println("Digite o código a ser analisado!");
	String texto = read.nextLine();
	texto = texto + " ";
        Lexico l = new Lexico(texto);
        
    }
    
}
