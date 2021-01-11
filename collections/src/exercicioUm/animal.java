package exercicioUm;

public class animal {
	private String nome;
	private int idade;
	private String atividade;
	
	
	public animal(String nome, int idade, String atividade) {
		this.nome = nome;
		this.idade = idade;
		this.atividade = atividade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	public String Animal(){
		return this.nome+", "+this.idade+" anos, "+this.atividade;
	}
	
}
