package novosexercícios;

import java.util.Scanner;

public class lista3javaexe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Digite o primeiro número:");
		    
		    
		    
		    double num1 = receba.nextDouble();

		    System.out.println("Digite a operação (+, -, *, /):");
		    char operacao = receba.next().charAt(0);
		    System.out.println("Digite o segundo número:");
		    double num2 = receba.nextDouble();

		    switch (operacao) {
		        case '+':
		            System.out.println("Resultado: " + (num1 + num2));
		            break;
		        case '-':
		            System.out.println("Resultado: " + (num1 - num2));
		            break;
		        case '*':
		            System.out.println("Resultado: " + (num1 * num2));
		            break;
		        case '/':
		            if (num2 != 0) {
		                System.out.println("Resultado: " + (num1 / num2));
		            } else {
		                System.out.println("Erro: Não é possível dividir por zero!");
		            }
		            break;
		        default:
		            System.out.println("Operação inválida!");
		            break;
		    }
		}

	}

}
