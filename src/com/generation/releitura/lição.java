package com.generation.releitura;

import java.util.Scanner;

public class li��o {
	/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
*/

	public static void main(String[] args) {
	
		int idade,
			anos, 
			meses,
			dias;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Anos:");
		anos = leia.nextInt();
		anos = anos * 365;
		
		System.out.println("Meses:");
		meses = leia.nextInt();
		meses = meses * 30;
		
		System.out.println("Dias: ");
		dias = leia.nextInt();
		idade = dias + meses + anos;
		
		System.out.println("Quantos dias j� viveu: " + idade);
		leia.close();
		
		
				
		
		
		
				
	}

}
