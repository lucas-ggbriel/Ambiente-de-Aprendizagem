package estruturaCondicional;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		double areaTriangulo[] = new double[3];
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			
			if(i == 0) 
			{
			System.out.println("Escreva a base do tri�ngulo: ");
			areaTriangulo[i] = ler.nextDouble();
			}else {
				System.out.println("Escreva a altura do tri�ngulo: ");
				areaTriangulo[i] = ler.nextDouble();
			}
			
			while(areaTriangulo[i]<0) {
				System.out.println("Por favor, digite um valor v�lido!");
				System.out.println("Escreva a base do tri�ngulo: ");
				areaTriangulo[i] = ler.nextDouble();
			}
		}
		
		areaTriangulo[2] = (areaTriangulo[0] * areaTriangulo[1])/2;
		
		System.out.println("\n\nA �rea desse triangulo � "+areaTriangulo[2]);
		
	}
}
