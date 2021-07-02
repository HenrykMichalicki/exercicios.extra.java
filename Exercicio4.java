package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double a, b, c, d;
		double r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de a do primeiro ponto: ");
		a = ler.nextDouble();
				
		System.out.println("Digite o valor de b do primeiro ponto: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de c do segundo ponto: ");
		c = ler.nextDouble();
		
		r = Math.pow((a+b), 2.0);
		d = Math.pow((b+c), 2.0);
		
		System.out.println("O resultado da expressão é de " + d);
		
		
		
	}

}
