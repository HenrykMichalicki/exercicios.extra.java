package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double custoFabrica, custoFinal;
		
		Scanner ler = next Scanner(System.in);
		
		System.out.println("Informe o valor de Fábrica do produto: ");
		custoFabrica = ler.nextDouble();
		
		custoFinal = (custoFabrica * 0.73) + custoFabrica;
		
		System.out.println("O valor final do produto é de RS ", custoFinal);
	}

}
