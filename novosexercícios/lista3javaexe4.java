package novosexercícios;

import java.util.Scanner;

public class lista3javaexe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  Scanner receba = new Scanner(System.in);
	        
	      
	        int totalCalorias = 0;
	        int opcao;

	      
	        System.out.println("Escolha o seu Prato:");
	        System.out.println("1 - Vegetariano (180 cal)");
	        System.out.println("2 - Peixe (230 cal)");
	        System.out.println("3 - Frango (250 cal)");
	        System.out.println("4 - Carne (350 cal)");
	        opcao = receba.nextInt();

	        switch (opcao) {
	            case 1:
	                totalCalorias = totalCalorias + 180;
	                break;
	            case 2:
	                totalCalorias = totalCalorias + 230;
	                break;
	            case 3:
	                totalCalorias = totalCalorias + 250;
	                break;
	            case 4:
	                totalCalorias = totalCalorias + 350;
	                break;
	        }

	       
	        System.out.println("Escolha a Sobremesa:");
	        System.out.println("1 - Abacaxi (75 cal)");
	        System.out.println("2 - Sorvete diet (110 cal)");
	        System.out.println("3 - Mouse diet (170 cal)");
	        System.out.println("4 - Mouse chocolate (200 cal)");
	        opcao = receba.nextInt();

	        switch (opcao) {
	            case 1:
	                totalCalorias = totalCalorias + 75;
	                break;
	            case 2:
	                totalCalorias = totalCalorias + 110;
	                break;
	            case 3:
	                totalCalorias = totalCalorias + 170;
	                break;
	            case 4:
	                totalCalorias = totalCalorias + 200;
	                break;
	        }

	     
	        System.out.println("Escolha a Bebida:");
	        System.out.println("1 - Chá (20 cal)");
	        System.out.println("2 - Suco de laranja (70 cal)");
	        System.out.println("3 - Suco de melão (100 cal)");
	        System.out.println("4 - Refrigerante diet (65 cal)");
	        opcao = receba.nextInt();

	        switch (opcao) {
	            case 1:
	                totalCalorias = totalCalorias + 20;
	                break;
	            case 2:
	                totalCalorias = totalCalorias + 70;
	                break;
	            case 3:
	                totalCalorias = totalCalorias + 100;
	                break;
	            case 4:
	                totalCalorias = totalCalorias + 65;
	                break;
	        }

	 
	        System.out.println("Total de calorias da refeição: " + totalCalorias + " cal");
	      
	        
	        receba.close();
	}

}
