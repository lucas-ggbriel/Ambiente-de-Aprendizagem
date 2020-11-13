package generation;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String arg[])
	{
		double nota1, nota2, nota3, mediaFinal;
		Scanner lerNota = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua 1° nota: ");
		nota1 = lerNota.nextDouble();
		
		System.out.println("Digite o valor da sua 2° nota: ");
		nota2 = lerNota.nextDouble();
		
		System.out.println("Digite o valor da sua 3° nota: ");
		nota3 = lerNota.nextDouble();
		
		
		mediaFinal = (nota1 * 0.2)+(nota2*0.3)+(nota3*0.5);
		
		System.out.println("Sua média final é igual à: "+mediaFinal);
	}
}
