package novosexercícios;

import java.util.Scanner;

public class lista3javaexe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner receba = new Scanner(System.in)) {
		    System.out.println("Usuário:");
		    String usuario = receba.next();

		    System.out.println("Senha:");
		    String senha = receba.next();

		  
		    if (usuario.equals("admin") && senha.equals("123")) {
		        System.out.println("Acesso permitido! Bem-vindo.");
		    } else {
		        System.out.println("Acesso negado! Usuário ou senha incorretos.");
		    }
		}

	}

}
