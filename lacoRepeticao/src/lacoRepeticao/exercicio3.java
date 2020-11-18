package lacoRepeticao;

import java.util.*;
public class exercicio3 {

	public static void main(String[] args) {
		
		int idade = 23, maior=0,menor=0;
		Scanner ler = new Scanner(System.in);

		while(idade !=-99)
		{
			if(idade < 21)
			{
				menor++;
			}else if (idade >50)
			{
				maior++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
			
		}
		
		System.out.printf("%s pessoa(s) tem menos de 21 anos e %s "
				+ "pessoa(s) tem mais de 50 anos.", menor,maior);
	}
}
