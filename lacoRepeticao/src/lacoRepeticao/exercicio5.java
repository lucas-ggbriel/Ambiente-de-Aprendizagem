package lacoRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int numero, totalNumeros = 0, i = 1; 
		double soma = 0, media;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite o " +i+ "� n�mero: ");
			numero = ler.nextInt();
			
			if(numero%3 == 0)
			{
				soma = soma + numero;
				totalNumeros++;				
			}
			i++;
		}while(numero != 0);
		
		media = soma/(totalNumeros-1);
		
		System.out.printf("\nDos n�meros digitados, %s s�o m�ltiplos de 3, e a m�dia entre eles � "
				+ "%s",totalNumeros-1,media);
	}
}
