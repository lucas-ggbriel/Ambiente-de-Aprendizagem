/**
 * 
 */
package exercicioUm;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		pessoa pessoaUm = new pessoa("Luccas");
		pessoa pessoaDois = new pessoa();
		pessoa pessoaTres = new pessoa("Gato", "Hortolândia", "1199999999");
		
		pessoaDois.nome = "Alexandre";
		
		System.out.println("Nome da primeira pessoa: "+pessoaUm+" \nSegunda pessoa: "+pessoaDois+" \n"
				+ "Terceira pessoa: "+pessoaTres);
	}

}
