package generation;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int tempoTotal, segundos, minutos, horas;
		Scanner leituraValores = new Scanner(System.in);
	
		System.out.println("Digite (em segundos) o tempo de duração de um evento na fábrica: ");
		tempoTotal = leituraValores.nextInt();
		
		horas = (tempoTotal - (tempoTotal % 3600))/3600;
		minutos = ((tempoTotal - (horas*3600) - ((tempoTotal - (horas*3600))%60)))/60;
		segundos = (tempoTotal - (horas*3600))%60;
		
		System.out.println("\nEstá duração equivale a "+horas+" Hora(s), "+minutos+" minuto(s) e "
		+segundos+" segundo(s).");
	}
}
