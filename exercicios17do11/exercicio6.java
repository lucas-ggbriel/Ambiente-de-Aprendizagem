package exercicios17do11;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		int matriz[] = new int[3], i = 0;
		Scanner ver = new Scanner(System.in);
		
		for(i = 0; i<3; i++)
		{
			System.out.printf("Digite o %s° valor: ",i+1);
			matriz[i] = ver.nextInt();
			
			if(matriz[i+1] == matriz[i]) {
				System.out.println("Por favor, digite valores diferentes!");
			}
			
			i++;		
		}
		
		
		
		Arrays.sort(matriz);
		
		System.out.println("\n\nO maior número digitado foi o "+matriz[2]);
		
		
	}
}
