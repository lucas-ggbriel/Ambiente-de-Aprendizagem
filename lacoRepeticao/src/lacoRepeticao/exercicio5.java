package lacoRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int numero, totalNumeros = 0, i = 1; 
		double soma = 0, media;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite o " +i+ "° número: ");
			numero = ler.nextInt();
			
			if(numero%3 == 0)
			{
				soma = soma + numero;
				totalNumeros++;				
			}
			i++;
		}while(numero != 0);
		
		media = soma/(totalNumeros-1);
		
		System.out.printf("\nDos números digitados, %s são múltiplos de 3, e a média entre eles é "
				+ "%s",totalNumeros-1,media);
	}
}
