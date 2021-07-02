package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/*média ponderada = 
		
		Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px)

		*/
		
		double nota1, nota2, nota3, media;
		
		Scanner ler =  new Scanner (System.in);
		
		System.out.println("Digite o valor da primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite o valor da terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1*2 + nota2*3 + nota3*5)/ 10);
		
		System.out.println("A média final do aluno é: " + media);
		
		
				
		
				

	
	
		
	}

}
