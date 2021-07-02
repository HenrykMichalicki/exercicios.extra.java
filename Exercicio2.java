package br.com.generation.exerciciosextras;

public class Exercicio2 {
	

	import java.util.Scanner;
			
	public static void main(String[] args) {
				
    int IdadeDias, IdadeAnos, IdadeMeses, IdadeRestante;
				
	Scanner ler = new Scanner(System.in); 
				
	System.out.println("Digite o número de dias da sua idade: ");
	IdadeDias = ler.nextInt();
						
    IdadeAnos = (IdadeDias/365);
    IdadeMeses = (IdadeDias%365)/30;
    IdadeRestante = (IdadeDias%365)%30;
				
	System.out.println("A idade é de " +  IdadeAnos + " anos, " + IdadeMeses + " meses e " + IdadeRestante + " dias." );
				
			}


}

