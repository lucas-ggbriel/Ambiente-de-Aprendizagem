package generation;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		double numA, numB, numC, r, s, d;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o n�mero A: ");
		numA = leitura.nextDouble();
		System.out.print("Digite o n�mero B: ");
		numB = leitura.nextDouble();
		System.out.print("Digite o n�mero C: ");
		numC = leitura.nextDouble();
		
		d = ((Math.pow(numA+numB, 2))+(Math.pow(numB+numC, 2)))/2;
		
		System.out.println("\n\nO valor dos valores digitados, dentro da express�o D = (R+S)/2,"
				+ " onde R = (n�mero A + n�mero B)^2 \ne S = (n�mero B + n�mero C)^2, "
				+ "� igual � "+d);
	}
}
