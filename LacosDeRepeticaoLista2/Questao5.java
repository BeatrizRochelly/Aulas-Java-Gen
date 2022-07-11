package LacosDeRepeticaoLista2;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */


public class Questao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		
		int n; 
		double soma=0;
		

		do
		{     
			System.out.println("Digite um número");
		    n=leia.nextInt();
			soma = soma + n;
			
			
		}while(n!=0);
		
		System.out.printf("A soma total dos números é: "+soma);

	}

}
