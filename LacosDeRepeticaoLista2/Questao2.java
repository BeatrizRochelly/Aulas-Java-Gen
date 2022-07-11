package LacosDeRepeticaoLista2;

import java.util.Scanner;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Questao2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
	    int x,n;
	    int ni = 0, np = 0;
	    
		for (x=1; x<=10; x++)
		{
			System.out.println("Digite um número: ");
			n=ler.nextInt();
			
			if(n%2==0)
			{
				np++;
			}
			else
			{
				ni++;
			}

			
	    }System.out.println("\n"+np+" número(s) par(es)");
	     System.out.println("\n"+ni+" número(s) ímpar(es)");
		
		
	}
	

}
	

