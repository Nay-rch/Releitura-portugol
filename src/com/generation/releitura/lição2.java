package com.generation.releitura;

import java.util.Scanner;

public class li��o2 {

	/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
*/
	public static void main(String[] args) {
	 
		int idade,
		anos,
		meses,
		dias;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Qual sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade / 365;
		idade = idade % 365;
		meses = idade / 30;
		idade = idade % 30;
		dias = idade;
		
		System.out.println("A idade � : " + anos + " anos");
		System.out.println("\nA quantidade de meses � : " + meses + " meses");
		System.out.println("\nA quantidade de dias � : " + dias + " dias");
		
		leia.close();
		
				
	}

}
