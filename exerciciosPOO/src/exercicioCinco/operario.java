package exercicioCinco;

public class operario extends pessoa{
	private double valorProducao = 15000.0;
	private double salario = 2000.0;
	private double comissao;
	
	public operario(String nome,double valorProducao,double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public operario() {
		
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public String comissao() {
		return "Seu sal�rio esse m�s ser� R$"+(salario+(valorProducao*(comissao/100)))+", sendo a comiss�o: R$"
				+ ""+(valorProducao*(comissao/100)); 
	}
	
}
