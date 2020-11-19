package matrizesVetores;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		int tamanhoMatriz;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número de jogadas dessa rodada: ");
		tamanhoMatriz = ler.nextInt();
		
		int soma = 0, totalMaior = 0, variavelAuxiliar = 0; double media;
		int matrizDado[] = new int [tamanhoMatriz], vetorAuxiliar[] = new int [tamanhoMatriz];
		
		
		for(int i = 0; i < tamanhoMatriz; i++)
		{
			System.out.printf("Escreva o resultado do %s° lançamento do Dado: \n", i+1);
			matrizDado[i] = ler.nextInt();
			
			while(matrizDado[i] < 0 || matrizDado[i] > 6)
			{
				System.out.println("Esse valor não existe em um dado!");
				System.out.printf("Escreva o resultado do %s° lançamento do Dado: \n", i+1);
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
			
			System.out.printf("%s° jogada: "+matrizDado[i]+"\n",i+1);
		}
		
		media = (double) soma/tamanhoMatriz;
		
		System.out.println("O número de vezes que o maior valor alcançado na "
				+ "rodada "+"("+vetorAuxiliar[tamanhoMatriz-1]
				+")"+" ocorreu foi "+totalMaior);
		System.out.println("A média dos resultados alcançados nessa jogada foi "+media);
		
	}
}
