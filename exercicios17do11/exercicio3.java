package exercicios17do11;

import java.util.Scanner;

public class exercicio3 {
		public static void main(String[] args) {
			
			int numeroMacas; 
			double totalPagar = 0; 
			Scanner lerMacas = new Scanner(System.in);
			
			System.out.println("Digite o número de maças compradas: ");
			numeroMacas = lerMacas.nextInt();
			
			while(numeroMacas < 0) {
				System.out.println("\nEscreva um número válido!");
				System.out.println("\nDigite o número de maças compradas: ");
				numeroMacas = lerMacas.nextInt();
			}
			
			if(numeroMacas<12)
			{
				totalPagar = numeroMacas * 0.3;
			}else if (numeroMacas >=12) {
				totalPagar = numeroMacas * 0.25;
			}
			
			System.out.println("O total a pagar é R$"+/*Math.round*/totalPagar);
		}
}
