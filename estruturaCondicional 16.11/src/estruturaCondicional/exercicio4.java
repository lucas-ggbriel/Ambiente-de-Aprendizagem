package estruturaCondicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner lerNumero = new Scanner(System.in);
		int numero;
		String parImpar, positivoNegativo;
		
		System.out.println("Escreva um número inteiro: ");
		numero = lerNumero.nextInt();
		
		
		if(numero%2 == 0)
		{
			parImpar = "par";
		}else {
			parImpar = "ímpar";
		}
		
		if(numero > 0) {
			positivoNegativo = "positivo";
		}else if (numero < 0){
			positivoNegativo = "negativo";
		}else {
			positivoNegativo = "ZERO não é uma número positivo nem negativo!";
		}
		
		System.out.println(numero+" é um número "+parImpar+" e "+positivoNegativo+".");
	}
}
