programa
{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida,
	exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		const inteiro numm = 3
		inteiro matriz[numm][numm],soma = 0, somad = 0,l = 0, c = 0

		escreva("Coloque os valores para formação de uma MATRIZ ",numm,"X",numm,": ",numm," linha(s) por ",numm," coluna(s).\n\n")
		
		para(l = 0;l<numm;l++)
		{
			para(c = 0; c<numm; c++)
			{
				escreva("Digite o valor da posição ",l,"X",c," da MATRIZ: ")
				leia(matriz[l][c])
			
			}
		}

		para(l = 0;l<numm;l++)
		{
			para(c = 0; c<numm; c++)
			{
				soma = soma + matriz[l][c]
				se(l == 1)
				{
				somad = somad + matriz[l][c]
				}
				
				escreva("[",matriz[l][c],"]")

			}
				escreva("\n\n")
			
		}

		
		escreva("A soma de todos os elementos desta MATRIZ é igual à: ",soma)
		escreva("\nA soma dos elementos da diagonal principal desta matriz é igual à: ",somad)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 720; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */