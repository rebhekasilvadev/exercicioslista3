package novosexercícios;

import java.util.Scanner;

public class lista3javaexe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Digite um número:");
		    int num = receba.nextInt();

		    if (num % 3 == 0 && num % 5 == 0) {
		        System.out.println("Múltiplo de 3 e 5");
		    } else if (num % 3 == 0) {
		        System.out.println("Apenas múltiplo de 3");
		    } else if (num % 5 == 0) {
		        System.out.println("Apenas múltiplo de 5");
		    } else {
		        System.out.println("Nenhum");
		    }
		}

	}

}
