package generation;

import java.util.Scanner;

public class exercicio2 {

	public static void main (String args[])
	{
		double precoFabrica, distribuidor, impostos, precoFinal;
		Scanner leitura = new Scanner(System.in);
	
		
		System.out.print("Digite o preço de fabrica de um veículo: R$");
		precoFabrica = leitura.nextDouble();
		
		distribuidor = precoFabrica * 0.28;
		impostos = precoFabrica * 0.45;
		precoFinal = distribuidor+impostos+precoFabrica;
		
		System.out.println("\n\nO preço final deste veículo será de R$"+precoFinal);
	}
}
