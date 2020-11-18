package estruturaCondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		float numeros[] = new float[4], quadradoNumeros[] = new float[4];
		Scanner lerNumeros = new Scanner(System.in);
		
		
		for(int i = 0; i<4; i++)
		{
			System.out.println("Digite o "+(i+1)+"° número: ");
			numeros[i] = lerNumeros.nextFloat();
			
			quadradoNumeros[i] = (float) Math.pow(numeros[i], 2);
		}
		
		if(quadradoNumeros[2] >= 1000)
		{
			System.out.println("O quadrado do 3° valor é igual a "+quadradoNumeros[2]);
		}else
		{	
			for(int i=0; i<4; i++) {
			System.out.println("O quadrado do "+(i+1)+" valor é igual a "+quadradoNumeros[i]);
			}
			
		}
	}
}
