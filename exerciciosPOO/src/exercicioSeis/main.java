/**
 * 
 */
package exercicioSeis;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		vendedor vendedorUm = new vendedor();
		
		System.out.println("Digite seu nome: ");
		vendedorUm.setNome(ler.nextLine());
		
		System.out.println("Digite a sua porcentagem de comiss�o do m�s: ");
		vendedorUm.setComissao(ler.nextDouble());
		
		System.out.println(vendedorUm.getNome()+", seu sal�rio esse m�s � R$"
				+ ""+(vendedorUm.getSalario()+vendedorUm.salarioFinal())+", sendo R$"
				+vendedorUm.salarioFinal()+" de comiss�o.");
	}

}
