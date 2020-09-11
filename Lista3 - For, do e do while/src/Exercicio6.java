import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3.
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		//VARIÁVEIS
		int numero, soma=0, mediaCont=0, mediaTotal=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//LÓGICA
		do
		{
			System.out.println("Digite um número: ");
			numero = kb.nextInt();
			
			if(numero%3==0)
			{
				mediaCont++;
				soma=soma+numero;
			
			}
			
		} while(numero!=0);
		
		mediaCont--;
		mediaTotal=soma/mediaCont;
		
		//SAÍDA
		System.out.printf("\nA média dos números divisíveis por 3 digitados é: %d.", mediaTotal);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
