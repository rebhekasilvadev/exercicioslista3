package novosexercícios;

import java.util.Scanner;

public class lista3javaexe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner receba = new Scanner(System.in)) {
			int opcao, saldo, credito;

			System.out.println("Selecione a faixa do seu saldo médio:");
			System.out.println("1 - Até 500");
			System.out.println("2 - De 501 até 1000");
			System.out.println("3 - De 1001 até 3000");
			System.out.println("4 - Acima de 3000");

			opcao = receba.nextInt();

			System.out.println("Digite o valor exato do seu saldo:");
			saldo = receba.nextInt();

			switch (opcao) {
			    case 1:
			        credito = 0;
			        System.out.println("Saldo: " + saldo + "  Crédito: Sem crédito");
			        break;

			    case 2:
			        credito = (saldo * 30) / 100;
			        System.out.println("Saldo: " + saldo + "  Crédito (30%): " + credito);
			        break;

			    case 3:
			        credito = (saldo * 40) / 100;
			        System.out.println("Saldo: " + saldo + "  Crédito (40%): " + credito);
			        break;

			    case 4:
			        credito = (saldo * 50) / 100;
			        System.out.println("Saldo: " + saldo + "  Crédito (50%): " + credito);
			        break;

			    default:
			        System.out.println("Opção inválida!");
			        break;
			}
		}
		
		
		
	}

}
