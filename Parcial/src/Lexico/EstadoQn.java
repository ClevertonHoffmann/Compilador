/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

/**
 *
 * @author Cleverton
 */
public class EstadoQn {
    
    private static int q;

	public EstadoQn() {
		setQ(-1);
	}
	public static int getQ() {
		return q;
	}

	public static void setQ(int q) {
		EstadoQn.q = q;
	}
    
}
