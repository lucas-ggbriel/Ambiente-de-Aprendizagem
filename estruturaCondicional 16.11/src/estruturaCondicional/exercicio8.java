package estruturaCondicional;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		double numero;
		Scanner lerNumero = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = lerNumero.nextDouble();
		
		if(numero > 100)
		{
			System.out.println("O n�mero digitado foi o "+numero);
		}else {
			numero = 0;
			System.out.println(numero);
		}
	}
}
