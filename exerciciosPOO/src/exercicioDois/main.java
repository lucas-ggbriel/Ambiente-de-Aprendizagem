/**
 * 
 */
package exercicioDois;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		fornecedor fornecedorUm = new fornecedor("MKG Informática","Campinas", "199999999", 16000.0, 14000.0);
		
		System.out.println("Seu saldo é R$"+fornecedorUm.obterSaldo());
	}

}
