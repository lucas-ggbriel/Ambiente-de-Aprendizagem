package estruturaCondicional;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String args[])
	{
	Scanner ler = new Scanner(System.in);
	int quilo, quiloExcedente = 0;
	float totalPagar;
	
	System.out.println("Digite o peso da carga transportada: ");
	quilo = ler.nextInt();
	
	if(quilo <= 50)
	{
		quilo = quilo + 0;
		System.out.println("Sem peso excedente, portanto, sem multa!");
	}else if(quilo>50) {
		quiloExcedente = 50;
		quiloExcedente = quilo - quiloExcedente;
		quilo = quilo - quiloExcedente;
		
		totalPagar = quiloExcedente * 4;
		System.out.println("\nVocê ultrapassou em "+quiloExcedente+"kg o limite de peso"
				+ " estabelecido, e terá que pagar uma multa no valor de R$"+totalPagar);
	}
	
	}

}
