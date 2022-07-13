package ExemplosDasAulas;

import java.util.Scanner;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.printf("Entre com a sua idade: ");
		idade= ler.nextInt();
		
		do
		{
			
			System.out.printf("\nSua idade: %d",idade);
			if(idade>=18)
			{
				System.out.printf("\nVocê é de maior...");
			}
			else
			{
				System.out.printf("\nVocê é de menor...");
			}
			
			System.out.printf("\nEntre com a sua idade: ");
			idade= ler.nextInt();
	   } while(idade>=1);
	}
}
