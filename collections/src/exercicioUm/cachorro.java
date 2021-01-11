package exercicioUm;

public class cachorro extends animal{
	public cachorro(String nome, int idade, String atividade) {
		super(nome, idade, atividade);
	}
	
	public String getSom() {
		return " faz \"auauau\"";
	}
}
