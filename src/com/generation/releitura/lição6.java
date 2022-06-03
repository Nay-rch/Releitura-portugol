package com.generation.releitura;

import java.util.Scanner;

public class lição6 {
	/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: */

	public static void main(String[] args) {
		
		int x1, x2, y1, y2, d ;
		
		Scanner leia = new Scanner (System.in);
		System.out.print("Escreva o valor de x1: ");
		x1 = leia.nextInt();
		System.out.print("Escreva o valor de x2: ");
		x2 = leia.nextInt();
		System.out.print("Escreva o valor de y1: ");
		y1 = leia.nextInt();
		System.out.print("Escreva o valor de y2: ");
		y2 = leia.nextInt();
		
		d = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		
		System.out.printf("O resultado da expressão é: %.2f", Math.sqrt(d) );
		
		leia.close();
		
		
		

	}

}
