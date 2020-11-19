package matrizesVetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int linha = 2, coluna = 2;
		
		int matrizUm[][] = new int [linha][coluna], matrizDois[][] = new int [linha][coluna];
		int matrizSoma[][] = new int[linha][coluna], matrizSubtracao[][] = new int[linha][coluna];
		
		Scanner ler = new Scanner(System.in);
		
		//alocação de valores nas matrizes 1 e 2
		for(int i = 0; i < linha; i++)
		{
			for(int j =0; j < coluna; j++)
			{
				System.out.printf("Digite o uma valor para a MATRIZ 1 [%s][%s]:\n",i+1,j+1);
				matrizUm[i][j] = ler.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < linha; i++)
		{
			for(int j =0; j < coluna; j++)
			{
				System.out.printf("Digite o uma valor para a MATRIZ 2 [%s][%s]:\n",i+1,j+1);
				matrizDois[i][j] = ler.nextInt();
			}
		}
		
		//formação das matrizes resultado
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j< coluna; j++)
			{
				matrizSoma[i][j] = matrizUm[i][j] + matrizDois[i][j]; 
				matrizSubtracao [i][j] = matrizUm[i][j] - matrizDois[i][j];
			}
		}
		
		//exibição das matrizes resultados
		for(int i = 0; i<1; i++)
		{
			for(i = 0; i<linha; i++)
			{
				int j = 0;
				if(i == 0 && j == 0) {
					System.out.println("Matriz resultante da soma dos valores "
							+ "de mesma posição da matriz 1 e matriz 2:");
					}
				
				for(j = 0; j<coluna; j++)
				{					
					System.out.print(matrizSoma[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println();
			
			
			for(i = 0; i<linha; i++)
			{
				int j = 0;
				
				if(i == 0 && j == 0) {
					System.out.println("Matriz resultante da diferença dos valores "
							+ "de mesma posição da matriz 1 e matriz 2:");
					}
				
				for(j = 0; j<coluna; j++)
				{
					System.out.print(matrizSubtracao[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		//fim do programa
		
	}
}
