import java.util.Scanner;

public class TesteString {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String meuGosto, habilidade;
	
		System.out.println("Digite quais seus Hobes, algo que você goste e outro que não goste: ");
		meuGosto = ler.nextLine();
		
		System.out.println("\n"+meuGosto);
		
		System.out.println("\n\nDigite quais mentalidades e habilidades utilizou para chegar até aqui: ");
		habilidade = ler.nextLine();
		
		System.out.println("\n"+habilidade);
	}
}
