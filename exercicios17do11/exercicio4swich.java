package exercicios17do11;

import java.util.Scanner;

public class exercicio4swich {

	public static void main(String[] args) {
		int lados; 
		double medidaLados, area, alturaTriangulo;
		Scanner lerLados = new Scanner (System.in);
		
		System.out.println("Para um polígono regular");
		
		System.out.println("\n\nDigite o número de lados do polígono: ");
		lados = lerLados.nextInt();
		
		while(lados<3) {
			System.out.println("Essa quantidade de lados não forma um polígono!");
			
			if(lados <0) {
				System.out.println("Apenas números positivos, por favor!");
			}
			
			System.out.println("\nDigite o número de lados do polígono: ");
			lados = lerLados.nextInt();
		}
		
		switch(lados)
		{
		
		case 3:
			System.out.println("\nDigite a medida do lado: ");
			medidaLados = lerLados.nextDouble();
			
			alturaTriangulo = Math.sqrt( Math.pow(medidaLados, 2) - Math.pow((medidaLados/2),2));
			area = (medidaLados * alturaTriangulo)/2;
			
			System.out.printf("A figura é um Triângulo com área igual a %f cm.", area);
		break;
		
		case 4: 
			System.out.println("\nDigite a medida do lado: ");
			medidaLados = lerLados.nextDouble();
			
			area = Math.pow(medidaLados, 2);
			System.out.printf("A figura é um Quadrado com área igual a %f cm.", area);
		break;
		
		case 5:
			System.out.println("A figura é um Pentágono");
		break;
		
		default:
			System.out.println("Polígono não identificado!");
		}
	}
}
