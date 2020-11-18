package lacoRepeticao;

public class exercicio10 {

	public static void main(String[] args) {
		int i = 233;
		
		System.out.println(i);
		
		while(i<457)
		{
			if(i<300 || i>400)
			{
				i = i+5;
				System.out.println("\n"+i);
			}else if(i>=300 && i <=456) {
				i = i+3;
				System.out.println("\n"+i);
			}
		}
	}
}
