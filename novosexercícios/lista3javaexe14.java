package novosexercícios;

import java.util.Scanner;

public class lista3javaexe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Valor unitário do produto:");
		    double valorUnitario = receba.nextDouble();

		    System.out.println("Quantidade comprada:");
		    int quantidade = receba.nextInt();

		    
		    double totalSemIpi = valorUnitario * quantidade;

		 
		    double valorIpi = totalSemIpi * 0.15;
		    double totalComIpi = totalSemIpi + valorIpi;

		    System.out.println("Total sem imposto: R$ " + totalSemIpi);
		    System.out.println("Valor do IPI (15%): R$ " + valorIpi);
		    System.out.println("Total a pagar: R$ " + totalComIpi);
		}

	}

}
