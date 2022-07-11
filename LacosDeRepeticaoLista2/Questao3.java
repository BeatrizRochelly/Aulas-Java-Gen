package LacosDeRepeticaoLista2;

import java.util.Scanner;

//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

public class Questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int mv=0, mc=0 ,idade;
		
		System.out.println("Digite sua idade");
		idade =leia.nextInt();
		
		while(idade!=-99)
		{
			if (idade<21) {
				 mv++;
			}
			    
			if (idade>50) {
				 mc++;
			}
			    
	        
		 System.out.println("Digite sua idade");
		 idade =leia.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos é: "+mv);
		System.out.println("Total de pessoas com mais de 50 anos é: "+mc);
			
		

	}

}
