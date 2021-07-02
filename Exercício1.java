package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasTotais;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite a sua idade em anos: ");
		anos = ler.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		meses = ler.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		diasTotais = ((365*anos) + (30*meses) + dias);
		
		System.out.println("A idade em dias é: " + diasTotais);
		
		
		
		
		
		
		
		
		
	}
}
