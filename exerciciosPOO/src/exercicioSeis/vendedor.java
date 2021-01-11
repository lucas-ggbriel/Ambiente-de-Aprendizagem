package exercicioSeis;

public class vendedor extends pessoa{
	private double valorVendas = 50000.0;
	private double salario = 2000.0;
	private double comissao;
	
	public double getSalario() {
		return salario;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double salarioFinal() {
		return this.valorVendas * (this.comissao/100);
	}
	
	
}
