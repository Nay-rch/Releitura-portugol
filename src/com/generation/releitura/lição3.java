package com.generation.releitura;

import java.util.Scanner;

public class li��o3 {

	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
*/
	public static void main(String[] args) {
		
		int total,
		segundos,
		minutos,
		horas;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Quanto segundos durou o evento: ");
		total = leia.nextInt();
		
		horas = total / 3600;
		total = total % 3600;
		minutos = total / 60;
		total = total % 60;
		segundos = total;
		
		System.out.print("O evento durou " + horas + " horas" );
		System.out.print(", " + minutos + " minutos");
		System.out.print(" e " + segundos + " segundos");
		
		leia.close();
				
		
		
	}

}
