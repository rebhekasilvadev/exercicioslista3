package novosexercícios;

import java.util.Scanner;

public class lista3javaexe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try (Scanner receba = new Scanner(System.in)) {
			int dia;

		    System.out.println("Digite um número de 1 a 7:");
		    System.out.println("(1-Dom, 2-Seg, 3-Ter, 4-Qua, 5-Qui, 6-Sex, 7-Sab)");
		    dia = receba.nextInt();

		    switch (dia) {
		     
		        case 1:
		        case 7:
		            System.out.println("Fim de semana");
		            break;

		        
		        case 2:
		        case 3:
		        case 4:
		        case 5:
		        case 6:
		            System.out.println("Dia útil");
		            break;

		   
		        default:
		            System.out.println("Número inválido! Escolha de 1 a 7.");
		            break;
	}
		 }

	}}
