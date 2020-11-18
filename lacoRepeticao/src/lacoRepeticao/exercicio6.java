package lacoRepeticao;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		int qp = 5, filhos[] = new int[qp], pessoasSalarioBaixo = 0;
		double salario[] = new double [qp], somaSalario = 0, somaFilhos = 0;
		String nomes[] = new String [qp];
		
		Scanner ler = new Scanner(System.in);
		
			
			
			for(int i = 0;i<qp; i++)
			{		
				if(i<qp) {
					System.out.println("Digite seu nome: ");
					nomes[i] = ler.next();
				}
				
				if(i<qp) {
					
					System.out.printf("Olá %s, qual seu salário? \n", nomes[i]);
					salario[i] = ler.nextDouble();
					
					somaSalario =  somaSalario + salario[i];		
				}
				
				if(i<qp) {
					System.out.println("Quantos filhos você têm? ");
					filhos[i] = ler.nextInt();
					
					somaFilhos = somaFilhos + filhos[i];
				}
				
				System.out.print("\n");
			}
			
					
			for(int i = 0; i<qp; i++) {
				
				if(salario[i] < 100)
				{
					pessoasSalarioBaixo++;
				}
			}
			
			Arrays.sort(salario);
			
			System.out.println("A média salarial dos entrevistados é R$"+somaSalario/qp);
			System.out.println("As pessoas dessa cidade têm em média "+Math.ceil(somaFilhos/qp)+" filho(s).");
			System.out.println("O maior salário registrado foi R$"+salario[qp-1]);
			System.out.println((pessoasSalarioBaixo*100)/qp+"% dos entrevistados recebe menos de R$100,00 reais.");
		
	}
}
