package lacoRepeticao;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		int numero, i = 0, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		while(i<(numero+1))
		{
			soma = soma + i;
			i++;
		}
		
		System.out.println("\nA soma de todos os n�mero entre 1 e "+numero+" � "+soma);
	}
}
