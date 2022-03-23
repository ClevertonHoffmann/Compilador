/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeradorIntermediario;

/**
 *
 * @author Cleverton
 */
public class Endereco {
    
    private String refer;
    private String var1;
    private String op;
    private String var2;

    public Endereco(){
        
    }
    
    public Endereco(String r, String v1, String op, String v2){
        this.refer = r;
        this.var1 = v1;
        this.op = op;
        this.var2 = v2;
    }

    public Endereco Endereco(String r, String v1, String op, String v2){
        Endereco e = new Endereco(r, v1, op, v2);
        return e;
    }
    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Endereco{" + "refer=" + refer + ", var1=" + var1 + ", op=" + op + ", var2=" + var2 + "}\n";
    }
    
}
