package exercicios17do11;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int numeroUm, numeroDois;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		numeroUm = leitura.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		numeroDois = leitura.nextInt();
		
		while(numeroDois == numeroUm)
		{
			System.out.println("\nOs n�mero n�o podem ser iguais!");
			System.out.println("\n\nDigite o 2� n�mero: ");
			numeroDois = leitura.nextInt();
		}
		
		if(numeroUm>numeroDois)
		{
			System.out.printf("O 1� valor (%d) � maior que o 2� valor (%d).",numeroUm,numeroDois);
		}else {
			System.out.printf("O 2� valor (%d) � maior que o 1� valor (%d).",numeroDois,numeroUm);
		}
	}
}
