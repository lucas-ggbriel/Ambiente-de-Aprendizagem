package exercicios17do11;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int senha, senhaConfere;
		String nome;
		Scanner lerSenha = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = lerSenha.nextLine();
		
		System.out.println("Crie uma senha: ");
		senha = lerSenha.nextInt();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		System.out.printf("Olá %s, digite sua senha: ", nome);
		senhaConfere = lerSenha.nextInt();
		
		if(senhaConfere == senha)
		{
			System.out.println("\nAcesso permitido!");
		}else {
			System.out.println("\nAcesso negado, senha errada!");
		}
		
		
		
		
	}
}
