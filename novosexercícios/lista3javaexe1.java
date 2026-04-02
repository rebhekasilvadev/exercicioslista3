package novosexercícios;

import java.util.Scanner;

public class lista3javaexe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);
	        int numero;

	        System.out.println("Digite um número inteiro:");
	        numero = receba.nextInt();

	        if (numero % 10 == 0) {
	            System.out.println("O número " + numero + " é divisível por 10");
	        } 
	         if (numero % 5 == 0) {
	            System.out.println("O número " + numero + " é divisível por 5");
	        } 
	       if (numero % 2 == 0) {
	            System.out.println("O número " + numero + " é divisível por 2");
	        } 
	        else {
	            System.out.println("Não é divisível por 10, 5 ou 2");
	        }

	        receba.close();
	}

}
