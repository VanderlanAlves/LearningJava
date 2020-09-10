import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-	Faça um programa em que permita a entrada
		 *  de um número qualquer e exiba se este número 
		 *  é par ou ímpar. Se for par exiba também a raiz 
		 *  quadrada do mesmo; se for ímpar exiba o número 
		 *  elevado ao quadrado.	
		 */
		
		//VARIÁVEIS
		double numero, raiz, quadrado;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite um número qualquer: ");
		numero = kb.nextDouble();
		
		//LÓGICA
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O número é par, e sua raiz quadrada é: %.2f", raiz);
		}
		
		else
		{
			quadrado = Math.pow(numero,2);
			System.out.printf("O número é ímpar, e seu quadrado é: %.2f", quadrado);
		}
		

		//ENCERRAMENTO DO TECLADO
		kb.close();
		
		
	}

}