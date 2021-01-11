package exercicioTres;

public class empregado extends pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double impostos;
	private double salarioFinal;
	
	public empregado(String nome, String endereco, String telefone)
	{
		super(nome, endereco, telefone);		
	}
	
	public empregado() {
		
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	public double getSalarioFinal() {
		return this.salarioFinal;
	}
	
	public double getCalcularSalario() {
		return this.salarioFinal = this.salarioBase - (this.salarioBase * (this.impostos/100)); 
	}
	
	
}
