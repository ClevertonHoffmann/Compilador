
import GeradorIntermediario.GeradorCodigoIntermediario;
import Lexico.Lexico;
import SintaticoAscendente.Sintatico;
import java.util.Scanner;

/*
 * Classe principal que chama o analisador lexico para início de análise.
 */
/**
 * Main Compilador Parcial
 *
 * @author Cleverton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Realiza a leitura do código digitado
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o código a ser analisado!");
        String texto = read.nextLine();
        texto = texto + " ";
        //----Inicio análise léxica---//
        Lexico l = new Lexico(texto);
        l.iniciaAnalise();
        System.out.println(l.getT().getListatokens());
        //---Fim análise léxica---//
        //---Inicio análise sintática com ações semânticas---//
        boolean b;
        Sintatico s = new Sintatico(l.getT());
        b = s.analisador();
        //---Fim análise sintática com ações semânticas---//
        //---Inicio da geração de código intermediário caso as análises estejam 100%---//
        if (b) {
            GeradorCodigoIntermediario g = new GeradorCodigoIntermediario(s.getSemantic().getTabelaSimb());
            g.geraCodigo();
            System.out.println(g.l.toString());
        }
        //---Fim da geração de código intermediário caso as análises estejam 100%---//
    }

}
