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
		
		empregado empregadoUm = new empregado("Lucas","Hortol�ndia","19988887777");
		
		System.out.println("Digite o c�digo do setor: ");
		empregadoUm.setCodigoSetor(ler.nextInt());
		
		System.out.println("Digite o sal�rio base: ");
		empregadoUm.setSalarioBase(ler.nextDouble());
		
		System.out.println("Digite o impostos: ");
		empregadoUm.setImpostos(ler.nextDouble());
		
		System.out.println("\nO sal�rio final � R$"+empregadoUm.getCalcularSalario());
	}

}
