
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
 * 
 */
package com.generation.releitura;

import java.util.Scanner;

public class liçao5 {
	
	
	public static void main(String[] args) {
		double nota1, nota2, nota3, media, mediaponderada;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 1º nota:");
		nota1 = leia.nextDouble();
		System.out.println("nota 1: " +  nota1);
		
		System.out.println("Digite 2º nota: ");
		nota2 = leia.nextDouble();
		System.out.println("nota 2: " + nota2);
		
		System.out.println("Digite 3º nota: ");
		nota3 = leia.nextDouble();
		System.out.println("nota 3: " + nota3);
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("media:" +  media);
		
		mediaponderada = ((nota1 * 2 ) +( nota2 * 3) +( nota3 * 5)) / 10;
		System.out.println("media ponderada:" +  mediaponderada);
    
		leia.close();
	}

}
