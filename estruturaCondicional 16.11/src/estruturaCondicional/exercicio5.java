package estruturaCondicional;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double indicePoluicao;
		
		
		System.out.println("Digite o �ndice recente de polui��o: ");
		indicePoluicao = ler.nextDouble();
		
		while(indicePoluicao < 0)
		{
			System.out.println("O �ndice s� pode ser maior que 0!\n\n");
			System.out.println("Digite o �ndice recente de polui��o: ");
			indicePoluicao = ler.nextDouble();
		}
		if(indicePoluicao >= 0.3 && indicePoluicao <0.4)
		{
			System.out.println("As empresas grupo 1 est�o intimadas a suspender suas atividades!");
		}else if (indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
			System.out.println("As empresas grupo 1 e 2 est�o intimadas a suspender suas atividades!");
		}else if (indicePoluicao >= 0.5) {
			System.out.println("Todos os grupos est�o intimados a suspender suas atividades!");
		}
	}
}
