package novosexercícios;

import java.util.Scanner;

public class lista3javaexe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Digite um número:");
		    int numero = receba.nextInt();

		    String resultado = (numero >= 10 && numero <= 50) ? "Dentro do intervalo" : "Fora do intervalo";

		    System.out.println(resultado);
		}

	}

}
