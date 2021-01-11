package exercicioDois;

public class mainFazenda {
	public static void main(String[] args) {
		
		cavalo cavalo = new cavalo("Trovão", 9, "Iririririn", "corre");
		cachorro cachorro = new cachorro("Leléco", 4, "auauau","corre");
		preguica preguica = new preguica("Evandra", 7, "shhh", "sobe em árvores");
		
		System.out.println(cavalo.Animal());
		System.out.println(cachorro.Animal());
		System.out.println(preguica.Animal());
	}
}
