import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados

		 */
		
		//VARIÁVEIS
		int[] vetor= new int[6]; 
		int contPar=0, somaPar=0, contImpar=0, somaImpar=0, i=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		for(i=0; i<vetor.length; i++)
		{
			System.out.printf("Digite a posição %d do vetor de 6 posições: ", i);
			vetor[i]=kb.nextInt();
		}
		
		System.out.printf("\n");
		
		//LÓGICA
		for(i=0; i<vetor.length; i++)
		{
			if(vetor[i]%2==0 && vetor[i]>=1)
			{
				contPar++;
				somaPar+=vetor[i];
				System.out.printf("O número %d é par.\n", vetor[i]);
			}
			
			else if(vetor[i]<=0)
			{
				System.out.printf("O número %d não é par nem ímpar.\n", vetor[i]);
				
			}
			else
			{
				contImpar++;
				somaImpar+=vetor[i];
				System.out.printf("O número %d é ímpar. \n", vetor[i]);
			}
		
		}
		
		
		//SAÍDA
		System.out.printf("\nA soma dos %d números pares digitados é de: %d. \nA soma dos %d números ímpares digitados é de: %d.", contPar, somaPar, contImpar, somaImpar);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
	}

}
