package LacosDeRepeticaoLista2;
//6- Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
 

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n,soma=0;
		float media=0, contador=0;
		
		
		do
		{System.out.println("Digite um número");
		n=leia.nextInt();
		    if(n%3==0 && n!=0)
			{
		    	
				soma = soma + n;// soma = soma + 3
				//0 = 0 + 3
				//soma= 0 + 3
			    //soma= 3 + 6
			    //soma = 9 + 0
			    //9 
				contador++;
			
		    }
		  media= soma/contador;

				
		}
		
		while (n!=0);
		
			System.out.println("A média dos números múltiplos de 3 é: "+media);
			
	
			
		}
		

	
	}

