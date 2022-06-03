package com.generation.releitura;

import java.util.Scanner;

public class lição4 {
		/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
, onde  
*/
	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		a = leia.nextInt();
		System.out.println("Digite o valor de B:");
		b = leia.nextInt();
		System.out.println("Digite o valor de C:");
		c = leia.nextInt();
		
		r = (a + b)*(a + b);
		s = (b + c)*(b + c);	
		d = (r + s) / 2;
		
		System.out.println("O valor de D é " + d );
		
		leia.close();
	}

}
