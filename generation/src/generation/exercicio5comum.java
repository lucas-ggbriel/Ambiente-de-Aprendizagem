package generation;

import java.util.Scanner;

public class exercicio5comum {

	public static void main(String[] args) {
		int idadeDMA[]= new int[3], idadeDias, i =0;
		Scanner lerData = new Scanner(System.in);
		String j;
		
		while(i<3)
		{
			if(i == 0)
			{
				j = "Anos:";
			}else if (i == 1) {
				j = "Meses:";
			}else {
				j = "Dias:";
			}
			
			System.out.println("Digite a sua idade em "+j);
			idadeDMA[i] = lerData.nextInt();
			
			
			i++;
		}
		
		idadeDias = idadeDMA[0]*365 + idadeDMA[1]*30 + idadeDMA[2];
		
		System.out.println("Você já viveu "+idadeDias+" dias.");
	}
}
