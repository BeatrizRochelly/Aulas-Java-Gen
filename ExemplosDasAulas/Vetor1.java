package ExemplosDasAulas;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		int vetor[]= new int[5]; 
 		int vetor1[] = {1,2,3,4,5};
		
		Scanner ler = new Scanner(System.in);
	
		
		for(int indice=0;indice<5;indice++) // a variável int já está dentro do parenteses do FOR, serve para economizar espaço e quando finalizar o lado ele termina, pois só vai funcionar ali dentro.
		{
			System.out.print(vetor1[indice]+"\t");
			
		}
		System.out.println();
		
		for(int indice=0;indice<5;indice++)
		{
			System.out.print("\nDigite uma idade: ");
			vetor[indice]=ler.nextInt();
			
		}
		System.out.println("\nAs idades informadas foram: ");
		
		for(int indice=0;indice<5;indice++)
		{
			System.out.print(vetor[indice]+"\t");
		}

	}

}
