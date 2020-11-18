package lacoRepeticao;

public class exercicio1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1000; i<=1999; i++)
		{
			if(i%11 == 5)
			{
				System.out.printf("\n%s quando divido por 11 tem resto 5.", i);
				total = total +1;
			}
		}
		
		System.out.println("\n\nEntre 1000 e 1999 existem "+total+" números que quando dividos por 11"
				+ " possuem resto igual a 5.");
	}
}
