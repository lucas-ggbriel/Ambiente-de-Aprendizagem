package lacoRepeticao;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
	
		double numero = 0, soma = 0; 
		int i=0;
		Scanner ler = new Scanner(System.in);
		
		while(numero>=0)
		{
			
			soma = soma + numero;
			i++;
			
			System.out.printf("Digite o %s n�mero: ", i);
			numero = ler.nextDouble();
		}
		
		System.out.println("\nA quantidade de valores fornecidos foi "+(i-1));
		System.out.println("A soma dos valores fornecidos � "+soma);
		System.out.println("A m�dia dos valores fornecidos � "+ (soma/(i-1)));
	}
}
