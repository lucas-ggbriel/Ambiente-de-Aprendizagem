/**
 * 
 */
package exercicioQuatro;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sn;
		
		administrador admUm = new administrador(40,5600);
		
		System.out.println("Qual seu nome? ");
		admUm.setNome(ler.nextLine());
		
		System.out.println("Esse m�s voc� viajou a trabalho? (RESPONDA Sim OU N�o)");
		sn = ler.nextLine();
		
		if(sn.equals("sim") || sn.equals("Sim")) 
			System.out.println(admUm.Sim());
		else if(sn.equals("n�o") || sn.equals("N�o")) 
			System.out.println(admUm.Nao());

		ler.close();
	}

}
