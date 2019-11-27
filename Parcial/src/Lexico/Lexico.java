    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import Token.TokenFactoryList;
import java.util.ArrayList;

/**
 *
 * @author Cleverton
 */
public class Lexico {
    
    private TokenFactoryList t;
    private String[] separado;
    private int count;
    private int i;
    private StringBuilder build; 
    private String texto;
    static EstadoQn h;
    
    public Lexico(String texto){
         this.separado = texto.split("");
         this.count = this.separado.length;
         this.build = new StringBuilder();
         this.texto = texto;
         this.i = 0;
    }

    public TokenFactoryList getT() {
        return t;
    }

    public void setT(TokenFactoryList t) {
        this.t = t;
    }
    
    public ArrayList iniciaAnalise(){
        char[] vet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9' };
                        
	System.out.println(count);
        EstadoQn.setQ(h.getQ()-1);
	while(count>0){
            System.out.println(q1(separado, texto, h.getQ(), build, vet));
	    build = new StringBuilder();
	}		
     
        return t.getListatokens();
        
    }
    
    public  String q1(String[] separado, String a, int q, StringBuilder build, char[] vet) {
		q++;
		System.out.println("q1");
                
                switch(separado[q]){
                    case "a":
                        build.append(separado[q]);
			return q2(separado, a, q, build, vet);
                    case "b":
                        build.append(separado[q]);
			//return q2(separado, a, q, build, vet);
                    break;
                    case "c":
                        build.append(separado[q]);
			//return q3(separado, a, q, build, vet);
                    break;
                    case "d":
                        build.append(separado[q]);
			//return q4(separado, a, q, build, vet);
                    break;
                    case "e":
                        build.append(separado[q]);
			//return q5(separado, a, q, build, vet);
                    break;
                    case "f":
                        build.append(separado[q]);
			//return q6(separado, a, q, build, vet);
                    break;
                    case "g":
                        build.append(separado[q]);
			//return q7(separado, a, q, build, vet);
                    break;
                    case "i":
                        build.append(separado[q]);
			//return q8(separado, a, q, build, vet);
                    break;
                    case "p":
                        build.append(separado[q]);
			//return q9(separado, a, q, build, vet);
                    break;
                    case "s":
                        build.append(separado[q]);
			//return q10(separado, a, q, build, vet);
                    break;
                    case "w":
                        build.append(separado[q]);
			//return q11(separado, a, q, build, vet);
                    break;
                    case "!":
                        build.append(separado[q]);
			//return q12(separado, a, q, build, vet);
                    break;
                    case "%":
                        build.append(separado[q]);
			//return q13(separado, a, q, build, vet);
                    break;
                    case "*":
                        build.append(separado[q]);
			//return q14(separado, a, q, build, vet);
                    break;
                    case "(":
                        build.append(separado[q]);
			//return q15(separado, a, q, build, vet);
                    break;
                    case ")":
                        build.append(separado[q]);
			//return q16(separado, a, q, build, vet);
                    break;
                    case "+":
                        build.append(separado[q]);
			//return q17(separado, a, q, build, vet);
                    break;
                    case "=":
                        build.append(separado[q]);
			//return q18(separado, a, q, build, vet);
                    break;
                    case "==":
                        build.append(separado[q]);
			//return q19(separado, a, q, build, vet);
                    break;
                    case ".":
                        build.append(separado[q]);
			//return q20(separado, a, q, build, vet);
                    break;
                    case ";":
                        build.append(separado[q]);
			//return q21(separado, a, q, build, vet);
                    break;
                    case "{":
                        build.append(separado[q]);
			//return q22(separado, a, q, build, vet);
                    break;
                    case "}":
                        build.append(separado[q]);
			//return q23(separado, a, q, build, vet);
                    break;
                    case "<":
                        build.append(separado[q]);
			//return q24(separado, a, q, build, vet);
                    break;
                    case ">":
                        build.append(separado[q]);
			//return q25(separado, a, q, build, vet);
                    break;
                    case "<=":
                        build.append(separado[q]);
			//return q26(separado, a, q, build, vet);
                    break;
                    case ">=":
                        build.append(separado[q]);
			//return q27(separado, a, q, build, vet);
                    break;
                    case "\\":
                        build.append(separado[q]);
			//return q28(separado, a, q, build, vet);
                    break;
                    case ",":
                        build.append(separado[q]);
			//return q29(separado, a, q, build, vet);
                    break;
                    case "1":
                        build.append(separado[q]);
			//return q30(separado, a, q, build, vet);
                    break;
                    case "2":
                        build.append(separado[q]);
			//return q31(separado, a, q, build, vet);
                    break;
                    case "3":
                        build.append(separado[q]);
			//return q32(separado, a, q, build, vet);
                    break;
                    case "4":
                        build.append(separado[q]);
			//return q33(separado, a, q, build, vet);
                    break;
                    case "5":
                        build.append(separado[q]);
			//return q34(separado, a, q, build, vet);
                    break;
                    case "6":
                        build.append(separado[q]);
			//return q35(separado, a, q, build, vet);
                    break;
                    case "7":
                        build.append(separado[q]);
			//return q36(separado, a, q, build, vet);
                    break;
                    case "8":
                        build.append(separado[q]);
			//return q37(separado, a, q, build, vet);
                    break;
                    case "9":
                        build.append(separado[q]);
			//return q38(separado, a, q, build, vet);
                    break;
                    case "0":
                        build.append(separado[q]);
			//return q39(separado, a, q, build, vet);
                    break;
                    case " ":
                        build.append(separado[q]);
			t.setListatokens("espaco", " ", i);
                        i++;
                        return "<espaco,' '> ";
                    default:
                        build.append(separado[q]);
			//return q40(separado, a, q, build, vet);                       
                }
                
                
                
//		if (separado[q].equals("i")) { 
//			build.append(separado[q]);
//			return q2(separado, a, q, build, vet);
//		} else if (separado[q].equals("e")) { 
//			build.append(separado[q]);
//			return q3(separado, a, q, build, vet);
//		} else if (separado[q].equals("f")) { 
//			build.append(separado[q]);
//			return q6(separado, a, q, build, vet);
//		} else if (separado[q].equals("c")) { 
//			build.append(separado[q]);
//			return q8(separado, a, q, build, vet);
//		} else if (separado[q].equals("w")) { 
//			build.append(separado[q]);
//			return q11(separado, a, q, build, vet);
//		} else if (separado[q].equals(">")) {
//			return q15(separado, a, q);
//		} else if (separado[q].equals("<")) {
//			return q16(separado, a, q);
//		} else if (separado[q].equals("+")) {                                                                                              
//			return q17(separado, a, q);
//		} else if (separado[q].equals("-")) {
//			return q18(separado, a, q);
//		} else if (separado[q].equals("{")) {
//			return q19(separado, a, q);
//		} else if (separado[q].equals("}")) {
//			return q20(separado, a, q);
//		} else if (separado[q].equals("(")) {
//			return q21(separado, a, q);
//		} else if (separado[q].equals(")")) {
//			return q22(separado, a, q);
//		} else if (separado[q].equals("==")) {
//			return q23(separado, a, q);
//		} else if (separado[q].equals("=")) {
//			return q24(separado, a, q);
//		} else if (separado[q].equals("0") || separado[q].equals("1") || separado[q].equals("2")
//				|| separado[q].equals("3") || separado[q].equals("4") || separado[q].equals("5")
//				|| separado[q].equals("6") || separado[q].equals("7") || separado[q].equals("8")
//				|| separado[q].equals("9")) {
//			build.append(separado[q]);
//			return q25(separado, a, q, build);
//		} else if (separado[q].equals(" ")) {
//			h.setQ(q++);
//                        this.count--;
//			return "";
//		} else {
//			for (int n = 0; n < vet.length; n++) {
//				char[] h = separado[q].toCharArray();
//				if (h[0] == vet[n]) {
//					build.append(h[0]);
//					return q27(separado, a, q, build, vet);
//				}
//			}
//
//		}
//		return "TOKEN INVALIDO";
//	}
//
//    
//    public String q2(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q2");
//		q++;
//
//		if (separado[q].equals("f") && (separado[q + 1].equals(" ") || separado[q + 1].equals("("))) {
//
//			h.setQ(q);
//                        this.count = count - 2;
//			return "<PALAVRA RESERVADA, IF>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
        return "";
	}
    
    public String q2(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
        System.out.println("q2");
        q++;
        if(separado[q].equals("r")){
            build.append(separado[q]);
            return q2(separado, a, q, build, vet);
        }
        if(separado[q].equals("a")){
            build.append(separado[q]);
            return q2(separado, a, q, build, vet);
        }
        if(separado[q].equals("y")){
            build.append(separado[q]);
            if(build.equals("array") && separado[q+1].equals(" ")){
                t.setListatokens("tipo", "array", i);
                i++;
                return "<tipo, array>";
            }else{           
              //  return q2(separado, a, q, build, vet);
            }
        }
 
        return "";	
    }
    
    public String q3(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
        System.out.println("q3");
        q++;

        if(separado[q].equals("r")){
            
        }
        
        return "";	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//	public String q2(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q2");
//		q++;
//
//		if (separado[q].equals("f") && (separado[q + 1].equals(" ") || separado[q + 1].equals("("))) {
//
//			h.setQ(q);
//                        this.count = count - 2;
//			return "<PALAVRA RESERVADA, IF>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//	}
//
//	public static String q3(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q3");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, E>";
//		} else if (separado[q].equals("l")) {
//			return q4(separado, a, q, build, vet);
//
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q4(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q4");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, EL>";
//		} else if (separado[q].equals("s")) {
//			return q5(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q5(String[] separado, String a, int q, StringBuilder build, char[] vet) { // verifica se � elsE
//		System.out.println("q5");
//		q++;
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, ELS>";
//		} else if (separado[q].equals("e")
//				&& (separado[q + 1].equals(" ") || separado[q + 1].equals("(") || separado[q + 1].equals(")"))) {
//			h.setQ(q);
//			return "<PALAVRA RESERVADA, ELSE>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q6(String[] separado, String a, int q, StringBuilder build, char[] vet) { // verifica se � fOr
//		System.out.println("q6");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, F>";
//		} else if (separado[q].equals("o")) {
//			return q7(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q7(String[] separado, String a, int q, StringBuilder build, char[] vet) { // verifica se � foR
//		System.out.println("q7");
//		q++;
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, FO>";
//		} else if (separado[q].equals("r")
//				&& (separado[q + 1].equals(" ") || separado[q + 1].equals("(") || separado[q + 1].equals(")"))) {
//			h.setQ(q);
//			return "<PALAVRA RESERVADA, FOR>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q8(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q8");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, C>";
//		} else if (separado[q].equals("a")) {
//			return q9(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//	}
//
//	public static String q9(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//		System.out.println("q9");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, CA>";
//		} else if (separado[q].equals("s")) {
//			return q10(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q10(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//																									// casE
//		System.out.println("q10");
//		q++;
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, CAS>";
//		} else if (separado[q].equals("e")
//				&& (separado[q + 1].equals(" ") || separado[q + 1].equals("(") || separado[q + 1].equals(")"))) {
//			h.setQ(q);
//			return "<PALAVRA RESERVADA, CASE>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q11(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//																									// wHile
//		System.out.println("q11");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, W>";
//		} else if (separado[q].equals("h")) {
//			return q12(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//	}
//
//	public static String q12(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//																									// whIle
//		System.out.println("q12");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, WH>";
//		} else if (separado[q].equals("i")) {
//			return q13(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//	}
//
//	public static String q13(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//																									// whiLe
//		System.out.println("q13");
//		q++;
//		build.append(separado[q]);
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, WHI>";
//		} else if (separado[q].equals("l")) {
//			return q14(separado, a, q, build, vet);
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//	}
//
//	public static String q14(String[] separado, String a, int q, StringBuilder build, char[] vet) { 
//																									// whilE
//		System.out.println("q14");
//		q++;
//		if (separado[q].equals(" ") || separado[q].equals("(") || separado[q].equals(")")) {
//			h.setQ(q);
//			return "<ID, WHIL>";
//		} else if (separado[q].equals("e")
//				&& (separado[q + 1].equals(" ") || separado[q + 1].equals("(") || separado[q + 1].equals(")"))) {
//			h.setQ(q);
//			return "<PALAVRA RESERVADA, WHILE>";
//		} else {
//			build.append(separado[q]);
//			return q27(separado, a, q, build, vet);
//		}
//
//	}
//
//	public static String q15(String[] separado, String a, int q) { //
//		System.out.println("q15");
//		q++;
//		h.setQ(q);
//		return "<COMPARADOR, > >";
//	}
//
//	public static String q16(String[] separado, String a, int q) { //
//		System.out.println("q16");
//		q++;
//		h.setQ(q);
//		return "<COMPARADOR, < >";
//	}
//
//	public static String q17(String[] separado, String a, int q) { //
//		System.out.println("q17");
//		q++;
//		h.setQ(q);
//		return "<OPERADOR, + >";
//	}
//
//	public static String q18(String[] separado, String a, int q) { //
//		System.out.println("q18");
//		q++;
//		h.setQ(q);
//		return "<OPERADOR, - >";
//	}
//
//	public static String q19(String[] separado, String a, int q) { //
//		System.out.println("q19");
//		q++;
//		h.setQ(q);
//		return "<DELIMITADOR, { >";
//	}
//
//	public static String q20(String[] separado, String a, int q) { //
//		System.out.println("q20");
//		q++;
//		h.setQ(q);
//		return "<DELIMITADOR, } >";
//	}
//
//	public static String q21(String[] separado, String a, int q) { //
//		System.out.println("q21");
//		h.setQ(q);
//		return "<DELIMITADOR, ( >";
//	}
//
//	public static String q22(String[] separado, String a, int q) { //
//		System.out.println("q22");
//		h.setQ(q);
//		return "<DELIMITADOR, ) >";
//	}
//
//	public static String q23(String[] separado, String a, int q) { //
//		System.out.println("q23");
//		q++;
//		h.setQ(q);
//		return "<COMPARADOR, == >";
//	}
//
//	public static String q24(String[] separado, String a, int q) { //
//		System.out.println("q24");
//		q++;
//		h.setQ(q);
//		return "<ATRIBUI��O, = >";
//	}
//
//	public static String q25(String[] separado, String a, int q, StringBuilder build) { //
//		System.out.println("q25");
//		q++;
//		if (separado.length > q +1) {
//			if (separado[q].equals("0") || separado[q].equals("1") || separado[q].equals("2") || separado[q].equals("3")
//					|| separado[q].equals("4") || separado[q].equals("5") || separado[q].equals("6")
//					|| separado[q].equals("7") || separado[q].equals("8") || separado[q].equals("9")) {
//				build.append(separado[q]);
//				return q25(separado, a, q, build);
//			} else if (separado[q].equals(",")) {
//				build.append(separado[q]);
//				return q26(separado, a, q, build);
//			} else {
//				h.setQ(q);
//				return "<TOKEN REJEITADO>";
//			}
//		} else {
//			h.setQ(q);
//			return "<NUMERO, " + build + " >";
//		}
//
//	}
//
//	public static String q26(String[] separado, String a, int q, StringBuilder build) { //
//		System.out.println("q26");
//		q++;
//		if (separado.length > q +1) {
//			if (separado[q].equals("0") || separado[q].equals("1") || separado[q].equals("2") || separado[q].equals("3")
//					|| separado[q].equals("4") || separado[q].equals("5") || separado[q].equals("6")
//					|| separado[q].equals("7") || separado[q].equals("8") || separado[q].equals("9")) {
//				build.append(separado[q]);
//				return q26(separado, a, q, build);
//			} else if (separado[q].equals(",")) {
//				h.setQ(q);
//				return "TOKEN REJEITADO";
//			}
//		} else {
//			h.setQ(q);
//			return "<NUMERO, " + build + ">";
//		}
//
//		return a;
//	}
//
//	public static String q27(String[] separado, String a, int q, StringBuilder build, char[] vet) { //
//		System.out.println("q27");
//		q++;
//		if (separado.length > q + 1) {
//			if (!separado[q].equals(" ")) {
//				for (int n = 0; n < vet.length; n++) {
//					char[] h = separado[q].toCharArray();
//					if (h[0] == vet[n]) {
//						build.append(vet[n]);
//						return q27(separado, a, q, build, vet);
//					}
//				}
//			} else {
//				h.setQ(q);
//				return "<ID, " + build + ">";
//			}
//		} else {
//			h.setQ(q);
//			return "<ID, " + build + ">";
//		}
//		if (separado[q].equals("(")) {
//			h.setQ(q-1);
//			return "<ID, " + build + ">";
//		} else if (separado[q].equals(")")) {
//			h.setQ(q-1);
//			return "<ID, " + build + ">";
//		}
//
//		h.setQ(q);
//		return "<ID, " + build + ">";
//	}
}
