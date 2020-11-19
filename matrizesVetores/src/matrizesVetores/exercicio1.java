package matrizesVetores;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		int tamanhoMatriz;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o n�mero de jogadas dessa rodada: ");
		tamanhoMatriz = ler.nextInt();
		
		int soma = 0, totalMaior = 0, variavelAuxiliar = 0; double media;
		int matrizDado[] = new int [tamanhoMatriz], vetorAuxiliar[] = new int [tamanhoMatriz];
		
		
		for(int i = 0; i < tamanhoMatriz; i++)
		{
			System.out.printf("Escreva o resultado do %s� lan�amento do Dado: \n", i+1);
			matrizDado[i] = ler.nextInt();
			
			while(matrizDado[i] < 0 || matrizDado[i] > 6)
			{
				System.out.println("Esse valor n�o existe em um dado!");
				System.out.printf("Escreva o resultado do %s� lan�amento do Dado: \n", i+1);
				matrizDado[i] = ler.nextInt();
			}
		}
		
		for(int i = 0; i <tamanhoMatriz; i++) {
		
			vetorAuxiliar[i] = matrizDado[i];
		}
		
		Arrays.sort(vetorAuxiliar);
		
		for(int i = 0; i <tamanhoMatriz; i++)
		{
			if(matrizDado[i] == vetorAuxiliar[tamanhoMatriz - 1])
			{
				totalMaior++;
			}
			
			soma = soma + matrizDado[i];
			
			System.out.printf("%s� jogada: "+matrizDado[i]+"\n",i+1);
		}
		
		media = (double) soma/tamanhoMatriz;
		
		System.out.println("O n�mero de vezes que o maior valor alcan�ado na "
				+ "rodada "+"("+vetorAuxiliar[tamanhoMatriz-1]
				+")"+" ocorreu foi "+totalMaior);
		System.out.println("A m�dia dos resultados alcan�ados nessa jogada foi "+media);
		
	}
}
