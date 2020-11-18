package lacoRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		double soma=0.0, numero;  int i = 1;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.printf("Digite o %s° número: \n",i);
			numero = ler.nextDouble();
			
			soma = soma + numero;
			i++;
		}while(numero < 0 || numero >0);
	
		System.out.println("A soma dos números digitados é igual a "+soma);
	}
}
