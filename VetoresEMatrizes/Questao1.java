package VetoresEMatrizes;

import java.util.Scanner;

//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

public class Questao1 {

	public static void main(String[] args) {
		int vetor[]= new int[5]; 
		int maior=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int p=0;p<5;p++)
		{
			System.out.print("\nDigite sua pontuação: ");
			vetor[p]=ler.nextInt();
		
			
			if(vetor[p] >maior)
			{
				maior=vetor[p];
				
			}
		
			 
	     } System.out.println("\nA maior pontuação informada foi: "+maior);
	     
	     for(int p=0;p<5;p++)
	     {
	    	 System.out.println("Os valores inseridos foram: " +vetor[p]);
	     }
  }
}
