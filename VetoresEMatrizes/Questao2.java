package VetoresEMatrizes;

import java.util.Scanner;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */

public class Questao2 {

	public static void main(String[] args) {
		int v[] = new int [10];
		int somalancamento=0, medialancamento, maiorpontuacao=0;
		
		Scanner ler= new Scanner(System.in);
		
		for(int x=0;x<10;x++)
		{
			System.out.println("Jogue o dado e diga o valor até 6: ");
			v[x]=ler.nextInt();
			somalancamento= somalancamento + v[x];
			if(v[x]==6)
			{
				maiorpontuacao++;
			}
			
		} medialancamento= somalancamento/10;
		
		System.out.println("A média de lançamento foi de: "+medialancamento);
		System.out.println("A maior pontuação ocorreu : " +maiorpontuacao+ " vezes");

	}

}
