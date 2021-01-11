package exercicioTres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		String sn;
		Scanner ler = new Scanner(System.in);
		Collection<estoque> produtos = new ArrayList<estoque>();
		
		
		estoque produtoA = new estoque("Sabão em pó", 11);
		estoque produtoB = new estoque("Sabonete", 9);
		estoque produtoC = new estoque("Detergente", 3);
		estoque produtoD = new estoque("Sabão", 4);
		estoque produtoE = new estoque("Papel higienico", 21);
		
		System.out.println("Você deseja adicionar um produto? (Sim ou Não)");
		sn = ler.nextLine();
		
		if(sn.equals("Sim"))
		{
			estoque produtoF = new estoque("acrescentar", 0);
			
			System.out.println("Digite o nome do produto: ");
			produtoF.setNomeProduto(ler.nextLine());				
			System.out.println("Digite a quantidade em estoque: ");
			produtoF.setQuantidadeProduto(ler.nextInt());
			produtos.add(produtoF);
		}else {
			System.out.println(produtos);
		}
		
		produtos.add(produtoA);
		produtos.add(produtoB);
		produtos.add(produtoC);
		produtos.add(produtoD);
		produtos.add(produtoE);
		
		System.out.println(produtos);

		produtos.remove(produtoA);
		
		System.out.println(produtos);
		
		ler.close();
	}
}
