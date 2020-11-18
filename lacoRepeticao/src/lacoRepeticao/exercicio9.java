package lacoRepeticao;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		double numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		numero = ler.nextDouble();
		while(numero<0)
		{
			System.out.println("Digite um valor positivo!");
			System.out.println("Digite um valor: ");
			numero = ler.nextDouble();
		}
		
		while(numero<100)
		{
			numero = numero *3;
			System.out.println("\n"+numero);
		}
	}
}
