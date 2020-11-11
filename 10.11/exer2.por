programa
{
	
	funcao inicio()
	{
		inteiro notas[10], i,soma = 0, vm = 0
		
		para(i=0;i<10;i++)
		{
			escreva("Escreva o ",i+1,"° lançamento: ")
			leia(notas[i])
			limpa()
			enquanto(notas[i] < 0 ou notas[i]>6)
			{
				escreva("Por favor, digite um valor válido!")
				escreva("\n\nEscreva o ",i+1,"° lançamento: ")
			     leia(notas[i])
			     limpa()
			}
			se(i<10)
			{
				soma = soma + notas[i]
			}
			se(notas[i] == 6)
			{
				vm = vm + 1
			}
		}

		soma = soma/10

		escreva("\n\nA media aritimética de todos os valores das jogadas é: ",soma,
		" \n\nO número de vezes que o valor máximo apareceu foi: ",vm)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */