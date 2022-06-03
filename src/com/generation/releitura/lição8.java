package com.generation.releitura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class li��o8 {
	/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
*/

	public static void main(String[] args) {
		
		String padrao = "###,###.##";
		DecimalFormat df= new DecimalFormat(padrao);
		
		double juros1, juros2, consumidor, fabrica;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("O custo de f�brica de um carro �: ");
		fabrica = leia.nextDouble();
		
		juros1 = fabrica * 0.28;
		juros2 = fabrica * 0.45;
		consumidor = juros1 + juros2 + fabrica;
		
		System.out.println("O custo do consumidor �: " + df.format(consumidor));
		
		leia.close();
		
		

	}

}
