package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2;
		double p1, p2;
		double d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = ler.nextDouble();
				
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = ler.nextDouble();
				
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow(x2-x1, 2.0);
		p2 = Math.pow(y2-y1, 2.0);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância de P1 para P2 é de: " + d);  
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
