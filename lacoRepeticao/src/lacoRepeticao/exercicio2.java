package lacoRepeticao;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		int tv = 10, vetor[] = new int[tv], par=0, impar=0;
		Scanner valores = new Scanner(System.in);
		
		for(int i = 0; i < tv; i++)
		{
			System.out.printf("Digite o %s� n�mero: ", i+1);
			vetor[i] = valores.nextInt();
			
			if(Math.pow(-1, vetor[i]) == 1)
			{
				par++;
			}else {
				impar++;
			}		
		}
		
		System.out.printf("\nDos n�meros digitados, %s s�o/� par(es) e %s s�o/� �mpar(es).",par,impar);
	}
}
