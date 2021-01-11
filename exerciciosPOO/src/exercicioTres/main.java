/**
 * 
 */
package exercicioTres;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		empregado empregadoUm = new empregado("Lucas","Hortolândia","19988887777");
		
		System.out.println("Digite o código do setor: ");
		empregadoUm.setCodigoSetor(ler.nextInt());
		
		System.out.println("Digite o salário base: ");
		empregadoUm.setSalarioBase(ler.nextDouble());
		
		System.out.println("Digite o impostos: ");
		empregadoUm.setImpostos(ler.nextDouble());
		
		System.out.println("\nO salário final é R$"+empregadoUm.getCalcularSalario());
	}

}
