/**
 * 
 */
package exercicioCinco;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		operario operarioUm = new operario();
		
		System.out.println("Qual seu nome?");
		operarioUm.setNome(ler.nextLine());
		System.out.println("Qual a porcentagem da sua comissão?");
		operarioUm.setComissao(ler.nextDouble());
		
		System.out.println(operarioUm.comissao());
		
		
	}

}
