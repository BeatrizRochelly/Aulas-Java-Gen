package ExemplosDasAulas;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade: ");
		idade= ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o seu nome: ");
		nome= ler.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVocê é maior de idade...");
		}
		else
		{
			System.out.printf("\nVocê é menor de idade...");
		}
		

	}

}
