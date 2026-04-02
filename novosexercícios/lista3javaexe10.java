package novosexercícios;

import java.util.Scanner;

public class lista3javaexe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Digite o seu IMC:");
		    double imc = receba.nextDouble();

		    if (imc < 18) {
		        System.out.println("Classificação: Magro");
		    } else if (imc >= 18 && imc <= 25) {
		        System.out.println("Classificação: Normal");
		    } else {
		        System.out.println("Classificação: Acima do peso");
		    }
		}

		
	}

}
