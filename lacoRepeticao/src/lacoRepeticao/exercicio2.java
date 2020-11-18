package lacoRepeticao;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		int tv = 10, vetor[] = new int[tv], par=0, impar=0;
		Scanner valores = new Scanner(System.in);
		
		for(int i = 0; i < tv; i++)
		{
			System.out.printf("Digite o %s° número: ", i+1);
			vetor[i] = valores.nextInt();
			
			if(Math.pow(-1, vetor[i]) == 1)
			{
				par++;
			}else {
				impar++;
			}		
		}
		
		System.out.printf("\nDos números digitados, %s são/é par(es) e %s são/é ímpar(es).",par,impar);
	}
}
