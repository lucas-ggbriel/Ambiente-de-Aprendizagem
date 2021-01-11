package exercicioTres;

public class estoque {
	private String nomeProduto;
	private int quantidadeProduto;
	
	public estoque(String nomeProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	@Override
	public String toString() {
		return this.nomeProduto+" "+this.quantidadeProduto;
	}
	
	
	
}
