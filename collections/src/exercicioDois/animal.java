package exercicioDois;

public class animal {
	private String nome;
	private int idade;
	private String som;
	private String atividade;
	
	
	public animal(String nome, int idade, String som, String atividade) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	public String Animal() {
		return this.nome+", têm "+this.idade+" anos, emite o som \""+this.som+"\" e "+this.atividade+".";
	}
}
