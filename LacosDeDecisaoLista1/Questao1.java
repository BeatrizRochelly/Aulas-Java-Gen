package LacosDeDecisaoLista1;

import java.util.Scanner;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.	
public class Questao1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: " );
		n1=leia.nextInt();
		System.out.println("\nDigite um segundo número: ");
		n2=leia.nextInt();
		System.out.println("\nDigite um terceiro número: ");
		n3=leia.nextInt();
		
		if (n2<n1 && n3<n1) // se o n2 for menor que o n1 e o n3 for menor que o n1, o n1 é o maior.
		{
			System.out.println("O primeiro é o Maior número --> número: " +n1);
		
		}
		else if(n3<n2 && n1<n2) // se o n3 for menor que o n2 e o n1 for menor que o n2, o n2 é o maior.
		{
			System.out.println("O segundo é o MAIOR número --> número: " +n2);
		}
		else //senão o terceiro é o maior.
		{
			System.out.println("O terceiro é o MAIOR número --> número: " +n3);
		}
			
		
		
	}

}
