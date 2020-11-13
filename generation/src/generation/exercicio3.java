package generation;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		double numA, numB, numC, r, s, d;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		numA = leitura.nextDouble();
		System.out.print("Digite o número B: ");
		numB = leitura.nextDouble();
		System.out.print("Digite o número C: ");
		numC = leitura.nextDouble();
		
		d = ((Math.pow(numA+numB, 2))+(Math.pow(numB+numC, 2)))/2;
		
		System.out.println("\n\nO valor dos valores digitados, dentro da expressão D = (R+S)/2,"
				+ " onde R = (número A + número B)^2 \ne S = (número B + número C)^2, "
				+ "é igual á "+d);
	}
}
