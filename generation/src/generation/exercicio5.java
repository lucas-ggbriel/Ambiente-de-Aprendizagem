package generation;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int dia,mes,ano, diaAtual = 13, mesAtual = 11, anoAtual = 2020, i = 0;
		Scanner lerAniversario = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento: ");
		dia = lerAniversario.nextInt();
		
		System.out.println("Digite o mês do seu nascimento: ");
		mes = lerAniversario.nextInt();
		
		System.out.println("Digite o ano do seu nascimento: ");
		ano = lerAniversario.nextInt();
		
		while(dia<31)
		{
			i++;
			dia++;
			
			if(dia == 30)
			{
				dia = 0;
				mes++;
			}if(mes == 12) {
				mes = 0;
				ano++;
			}if(ano == anoAtual && dia == diaAtual && mes == mesAtual) {
				dia = 31;
			}
		}
		
		System.out.println("\n\nVocê já viveu "+i+" dias.");
	}
}
