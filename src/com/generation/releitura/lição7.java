package com.generation.releitura;

import java.util.Scanner;

public class lição7 {
	/*7. Um sistema de equações lineares do tipo: 
*/
	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("O valor de A:");
		a = leia.nextInt();
		System.out.println("O valor de B:");
		b = leia.nextInt();
		System.out.println("O valor de C:");
		c = leia.nextInt();
		System.out.println("O valor de D:");
		d = leia.nextInt();
		System.out.println("O valor de E:");
		e = leia.nextInt();
		System.out.println("O valor de F:");
		f = leia.nextInt();
		
		x = (c * e) - (b * f) / (a * e) - (b * d);
		y = (a * f) - (c * d) / (a * e) - (b * d);
		
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
		
		leia.close();

	}

}
