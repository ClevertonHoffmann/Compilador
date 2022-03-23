/*
 * Classe responsável pela análise sintática
 */
package SintaticoAscendente;
import Semantico.Semantico;
import Token.TokenFactoryList;
import java.util.Stack;

/**
 * Classe responsável pela análise sintática
 *
 * @author Cleverton
 */
public class Sintatico {

    private TabelasGOTOeACTION t;
    private Stack p;
    private TokenFactoryList listaTok;
    private Semantico semantic;

    public Sintatico(TokenFactoryList to) {
        this.t = new TabelasGOTOeACTION();
        this.listaTok = to;
        this.p = new Stack();
        this.semantic = new Semantico();
    }

    public boolean analisador() {
        p.push("$");
        p.push(0);
        int i = 0;
        listaTok.setListatokens("$", "$", listaTok.getListatokens().size());
        while (true) {
            try {
                System.out.println(p);
                System.out.println(listaTok.getListatokens().get(i).getToken().getTok());
            //    System.out.println(listaTok.getListatokens().get(i).getToken().getTok());
                if (((String) t.getACTION().get(
                        (int) p.peek() //pega o último elemento da pilha
                ).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                )).substring(0, 1).equals("s")) { //Shift
                    p.push(Integer.parseInt(((String) t.getACTION().get((int) p.peek()).get( //empilha na pilha
                            listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                    )).substring(1)));
                    //Insere ação semântica conforme símbolo empilhado na pilha
                    if (!semantic.acaoSemantica((int) p.peek(), listaTok.getListatokens().get(i))) {
                        return false;
                    }
                    i++;
                    // System.out.println(p);
                } else if (((String) t.getACTION().get((int) p.peek()).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                )).substring(0, 1).equals("r")) { //reduce
                    int ultimo = (int) p.peek();
                    int aux = Integer.parseInt(((String) t.getACTION().get((int) p.peek()).get(
                            listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                    )).substring(1));
                    for (int j = 0; j < aux; j++) {
                        p.pop();
                        System.out.println(p);
                    }
                    p.push(t.getGOTO()[ultimo].get((int) p.peek()));
                    //  System.out.println(p);
                } else if (((String) t.getACTION().get((int) p.peek()).get(
                        listaTok.getListatokens().get(i).getToken().getTok() //Token entrada
                )).equals("acc")) { //fim da gramática
                    System.out.println("Linguagem aceita");
                    return true;
                } else {
                    System.out.println("Erro");
                    return false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Linguagem não aceita");
                return false;
            }
        }
    }

    public TabelasGOTOeACTION getT() {
        return t;
    }

    public void setT(TabelasGOTOeACTION t) {
        this.t = t;
    }

    public Stack getP() {
        return p;
    }

    public void setP(Stack p) {
        this.p = p;
    }

    public TokenFactoryList getListaTok() {
        return listaTok;
    }

    public void setListaTok(TokenFactoryList listaTok) {
        this.listaTok = listaTok;
    }

    public Semantico getSemantic() {
        return semantic;
    }

    public void setSemantic(Semantico semantic) {
        this.semantic = semantic;
    }

}
