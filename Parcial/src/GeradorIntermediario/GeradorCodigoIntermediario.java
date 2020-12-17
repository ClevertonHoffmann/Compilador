/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeradorIntermediario;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Classe geradora de código intermediário em 3 endereços
 * @author Cleverton
 */
public class GeradorCodigoIntermediario {

    private Stack tabelaSimb;
    public ListaTresEnderecos l;

    public GeradorCodigoIntermediario(Stack tab) {
        this.tabelaSimb = tab;
        this.l = new ListaTresEnderecos();
    }
    /**
     * Percorre a tabela de símbolos e gera uma lista de endereços
     * @return Booleano
     */
    public boolean geraCodigo() {
        ArrayList<String> aux;
        ArrayList<Endereco> end;
        for (int i = 0; i < tabelaSimb.size(); i++) {
            end = new ArrayList<>();
            ArrayList<String> tab = (ArrayList<String>) tabelaSimb.get(i);
            if (!"".equals(tab.get(4)) && tab.get(4).length()>2) {
                String exp = tab.get(4);
                aux = new ArrayList<>();
                for (int j = 0; j < exp.length(); j++) {
                    if(!";".equals(exp.substring(j, j + 1))) {
                        aux.add(exp.substring(j, j + 1));                       
                    }                     
                }
                int k = 0;
                for (int j = 0; j < aux.size()-2; j=j+2) {
                    if(j==0){
                        end.add(new Endereco("A"+j, aux.get(j), aux.get(j+1), aux.get(j+2)));
                    }else{
                        end.add(new Endereco("A"+k, end.get(k).getRefer(), aux.get(j+1), aux.get(j+2)));
                        k++;
                    }
                }
                //Seta a variável que recebe a expressão sobre o ultimo endereço
                end.set(k, new Endereco(tab.get(0), end.get(k-1).getRefer(), end.get(k-1).getOp(), end.get(k-1).getVar2()));
                l.listaTresEnderecos.add(end);
            }
        }

        return true;
    }

}
