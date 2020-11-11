programa
{
	
	funcao inicio()
	{
		inteiro notas[4],i,var1 = 0,var2 = 0

		para (i=0;i<4;i++)
		{
			escreva("Digite os valores: ")
			leia(notas[i])
			limpa()			
		}
		escreva(notas[0]," ",notas[1]," ",notas[2]," ",notas[3])

		se(notas[0]>notas[1])
		{
			var1 = notas[0]
		}senao
		{
			var1 = notas[1]
		}

		se(notas[2]>notas[3])
		{
			var2 = notas[2]
		}senao
		{
			var2 = notas[3]
		}

		se(var1>var2){
			escreva("\n",var1," é o maior número da sequência!")
		}senao{
			escreva("\n",var2," é o maior número da sequência!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */