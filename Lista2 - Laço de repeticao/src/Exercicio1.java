import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 *Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		
		//VARIAVEIS
		int numero1, numero2, numero3;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o primeiro número: ");
		numero1=kb.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2=kb.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3=kb.nextInt();
		
		//LÓGICA E SAÍDA
		if(numero1<=numero3 && numero2<=numero3) {
			System.out.printf("\nO maior número é: %d", numero3);
		}
		
		if(numero1<=numero2 && numero3<=numero2) {
			System.out.printf("\nO maior número é: %d", numero2);
			
		}
		
		if(numero2<=numero1 && numero3<=numero1) {
			System.out.printf("\nO maior número é: %d", numero1);
			
		}
	}

}
