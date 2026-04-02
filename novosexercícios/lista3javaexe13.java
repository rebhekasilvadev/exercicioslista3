package novosexercícios;

import java.util.Scanner;

public class lista3javaexe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Lado 1:"); int l1 = receba.nextInt();
		    System.out.println("Lado 2:"); int l2 = receba.nextInt();
		    System.out.println("Lado 3:"); int l3 = receba.nextInt();

		    if (l1 == l2 && l2 == l3) {
		        System.out.println("Equilátero (todos iguais)");
		    } else if (l1 == l2 || l1 == l3 || l2 == l3) {
		        System.out.println("Isósceles (dois iguais)");
		    } else {
		        System.out.println("Escaleno (todos diferentes)");
		    }
		}

	}

}
