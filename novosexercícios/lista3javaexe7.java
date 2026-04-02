package novosexercícios;

import java.util.Scanner;

public class lista3javaexe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Digite o valor da compra:");
		   
		    double valorOriginal = receba.nextDouble();

		    double desconto = (valorOriginal > 100) ? (valorOriginal * 0.10) : 0;

		    double valorFinal = valorOriginal - desconto;

		    System.out.println("Valor original: R$ " + valorOriginal);
		    System.out.println("Desconto aplicado: R$ " + desconto);
		    System.out.println("Total a pagar: R$ " + valorFinal);
		}
	}

}
