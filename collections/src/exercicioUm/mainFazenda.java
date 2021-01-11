package exercicioUm;

public class mainFazenda {
	public static void main(String[] args) {
		
		cavalo cavalo = new cavalo("Trovão", 9, "corre");
		cachorro cachorro = new cachorro("Leléco", 4,"corre");
		preguica preguica = new preguica("Evandra", 7, "sobe em árvores");
		
		System.out.println(cavalo.Animal()+cavalo.getSom());
		System.out.println(cachorro.Animal()+cachorro.getSom());
		System.out.println(preguica.Animal()+preguica.getSom());
	}
}
