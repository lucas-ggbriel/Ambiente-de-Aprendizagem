package exercicioQuatro;

public class administrador extends pessoa{
	private int codigoFuncionario;
	private String email;
	private double ajudaDeCusto = 30000;
	private double horasTrabalhadas;
	private double salario;
	private double tempoDeServico;
	
	public administrador(double horasTrabalhadas, double salario) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.salario = salario;
	}
	
	public administrador() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getTempoDeServico() {
		return tempoDeServico;
	}

	public void setTempoDeServico(double tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	
	public String Sim() {
		return nome+", sua ajuda de custo � R$"+ajudaDeCusto+", e voc� trabalhou "+horasTrabalhadas+" horas esse m�s."
				+ "\nSeu sal�rio final � R$"+(salario+ajudaDeCusto);
	}
	public String Nao() {
		ajudaDeCusto = 0;
		horasTrabalhadas = 20;
		return nome+", voc� n�o tem direito a ajuda de custo!"+"\nVoc� trabalhou "+horasTrabalhadas+" horas esse m�s."
				+ "\nSeu sal�rio final � R$"+(salario+ajudaDeCusto);
	}
	
	@Override
	public String toString() {
		return "administrador [ajudaDeCusto=" + ajudaDeCusto + ", horasTrabalhadas=" + horasTrabalhadas + ", salario="
				+ salario + "]";
	}
	
	
	
	
}
