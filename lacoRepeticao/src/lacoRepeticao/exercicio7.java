package lacoRepeticao;

public class exercicio7 {

	public static void main(String[] args) {
		int soma = 0;
		for(int i=0; i<500; i++)
		{
			if(i%2 != 0) {
				if(i%3 == 0) {
					soma = soma + i;					
				}
			}
		}
		
		System.out.println("A soma de todos os números ímpares multiplos de 3"
				+ " entre 0 e 500 é "+soma);
	}
}
