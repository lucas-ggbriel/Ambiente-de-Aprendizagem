package exercicioTres;

public class pessoa {
	String nome;
	String endereco;
	String telefone;
	
	public pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public pessoa() {
		
	}
	
	public pessoa(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
	
	
}
