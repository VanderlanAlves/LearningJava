import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado 
		 * até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		//VARIÁVEIS
		double numero, soma=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//LÓGICA
		do
		{
			System.out.println("Digite um número: ");
			numero = kb.nextDouble();
			
			soma=soma+numero;
			
		} while(numero!=0);

		
		
		//SAÍDA
		System.out.printf("\nA soma dos números digitados é: %.2f.", soma);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
