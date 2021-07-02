package br.com.generation.exerciciosextras;

	import java.util.Scanner;

	public class Exercicio3 {
		
		public static void main(String[] args) {
			
			int horas, minutos, segundos, horasResto;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("O tempo de duração do evento na fábrica em segundo é: ");
			segundos = ler.nextInt();
					
			horas =  segundos / 3600;
			horasResto = segundos%3600;
			minutos =  horasResto/60;
			segundos = horasResto%60; 
			
			System.out.println("O evento durou " , horas, " horas " , minutos, "minutos", segundos, "segundos.");
			
		}

	}

