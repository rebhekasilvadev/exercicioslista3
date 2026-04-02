package novosexercícios;

import java.util.Scanner;

public class lista3javaexe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		 
		    System.out.println("--- MENU DE OPÇÕES ---");
		    System.out.println("1 - Ver saldo");
		    System.out.println("2 - Depositar");
		    System.out.println("3 - Sair");
		    System.out.print("Escolha uma opção (1, 2 ou 3): ");
		    
		    int opcao = receba.nextInt();

		  
		    switch (opcao) {
		        case 1:
		            System.out.println("Seu saldo é R$ 1.500,00");
		            break; 
		        case 2:
		            System.out.println("Opção de Depósito selecionada.");
		            break;

		        case 3:
		            System.out.println("Saindo do sistema...");
		            break;

		        default:
		        
		            System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
		            break;
		    }
		}


	}

}
