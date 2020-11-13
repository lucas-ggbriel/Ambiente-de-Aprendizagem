package generation;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int diasVividos, anos,meses,dias;
		Scanner lerDias = new Scanner(System.in);
		
		System.out.println("Digite quantos dias você já viveu: ");
		diasVividos = lerDias.nextInt();
		
		anos = diasVividos/365;
		meses = (diasVividos - (anos*365))/30;
		dias = diasVividos - (anos*365 + meses*30);
		
		System.out.println("Você tem "+anos+" ano(s), "+meses+" mese(s) e "+dias+" dia(s) de vida!");
	
		
				
	}
}
