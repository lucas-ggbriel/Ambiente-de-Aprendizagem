package estruturaCondicional;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Sauda��es Nadador! Por favor, digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >=5 && idade <=8)
		{
			System.out.println("Nadador, sua categoria � Infantil A!");
		}else if(idade >8 && idade <= 11) {
			System.out.println("Nadador, sua categoria � Infantil B!");
		}else if(idade >=12 && idade <= 13) {
			System.out.println("Nadador, sua categoria � Juvenil A!");
		}else if(idade >=14 && idade <= 17) {
			System.out.println("Nadador, sua categoria � Juvenil B!");
		}else if(idade >=18) {
			System.out.println("Nadador, sua categoria � Adulto!");
		}else {
			System.out.println("Nadador, voc� n�o se enquadra em nenhuma categoria!");
		}
		
	}
}
