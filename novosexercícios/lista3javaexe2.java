package novosexercícios;

import java.util.Scanner;

public class lista3javaexe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner receba = new Scanner(System.in);
		double peso, altura, imc;

		System.out.println("Cálculo de IMC");

		System.out.print("Digite o seu peso: ");
		peso = receba.nextDouble();

		System.out.print("Digite a sua altura: ");
		altura = receba.nextDouble();

		imc = peso / (altura * altura);

		System.out.println("Seu IMC é: " + imc);

	
		if (imc < 18.5) {
		    System.out.println("Abaixo do peso");
		}

		if (imc >= 18.5 && imc < 25) {
		    System.out.println("Peso Normal");
		}

		if (imc >= 25 && imc < 30) {
		    System.out.println("Sobrepeso");
		}

		if (imc >= 30 && imc <= 40) {
		    System.out.println("Obesidade");
		}

		if (imc > 40) {
		    System.out.println("Obesidade Mórbida");
		}

		receba.close();
		
	}

}
