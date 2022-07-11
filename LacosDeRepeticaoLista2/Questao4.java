package LacosDeRepeticaoLista2;

import java.util.Scanner;

/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)

O número de pessoas calmas;
O número de mulheres nervosas;
O número de homens agressivos;
o número de outros calmos;
O número de pessoas nervosas com mais de 40 anos;
O número de pessoas calmas com menos de 18 anos.

*/

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  idade, sexo, temperamento, p=0, pessoasc=0, mulheresn=0, homensa=0, outrosc=0 ,pessoasnmais40=0,pessoascmenos18=0;
		
		
		while(p<=150)
		{
			System.out.println("Digite a sua idade");
			idade=leia.nextInt();
			
			System.out.println("Digite 1-feminino / 2-masculino / 3-Outros para o seu sexo");
			sexo=leia.nextInt();
			
			System.out.println("Digite 1, se você é calma(o); 2, se você é nervoso(a) e 3, se você é agressivo(a)");
			temperamento=leia.nextInt();
			
			if(temperamento==1)
			{
				pessoasc++;
			}
			
			if(temperamento==2 && sexo==1)
			{
				mulheresn++;
			}
			if(temperamento==3 && sexo==2)
			{
				homensa++;
			}
			if(temperamento==1 && sexo==3)
			{
				outrosc++;
			}
			if(temperamento==2 && idade>40)
			{
				pessoasnmais40++;
			}
			if(temperamento==1 && idade<18)
			{
				pessoascmenos18++;
			}
			p++;
			
		}
		System.out.println("A quantidade de pessoas calmas é: "+pessoasc);
		System.out.println("A quantidade de mulheres nervosas é: "+mulheresn);
		System.out.println("A quantidade de homens agressivos é: "+homensa);
		System.out.println("A quantidade de outros calmos é: "+outrosc);
		System.out.println("A quantidade de pessoas nervosas com mais de 40 anos é: "+pessoasnmais40);
		System.out.println("A quantidade de pessoas calmas com menos de 18 anos é: "+pessoascmenos18);
		
		
	
		

	}

}
