package estruturaCondicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner lerNumero = new Scanner(System.in);
		int numero;
		String parImpar, positivoNegativo;
		
		System.out.println("Escreva um n�mero inteiro: ");
		numero = lerNumero.nextInt();
		
		
		if(numero%2 == 0)
		{
			parImpar = "par";
		}else {
			parImpar = "�mpar";
		}
		
		if(numero > 0) {
			positivoNegativo = "positivo";
		}else if (numero < 0){
			positivoNegativo = "negativo";
		}else {
			positivoNegativo = "ZERO n�o � uma n�mero positivo nem negativo!";
		}
		
		System.out.println(numero+" � um n�mero "+parImpar+" e "+positivoNegativo+".");
	}
}
