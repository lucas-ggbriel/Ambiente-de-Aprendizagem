package estruturaCondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		float salario, horasExtras = 0, codigoFuncionario,  horasTrabalhadas;
		
		Scanner lerSalario = new Scanner(System.in);
		
		System.out.println("Digite o código de funcionário: ");
		codigoFuncionario = lerSalario.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = lerSalario.nextFloat();
		
		if(horasTrabalhadas >50) {
			horasExtras = horasTrabalhadas - 50;	
			horasTrabalhadas = horasTrabalhadas - horasExtras;
		}else if(horasTrabalhadas <=50) {
			horasExtras = 0;
		}
		
		salario = (horasTrabalhadas * 10) + (horasExtras * 20);
		
		System.out.println("O funcionário "+codigoFuncionario+" trabalhou um total de "+(horasTrabalhadas+horasExtras)+""
				+ " hora(s), portanto, seu salário será de R$"+salario+""
						+ " reais, sendo R$"+(horasExtras * 20)+" reais de horas extras.");
		
	}
}
