import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·                     10-14 infantil
·                     15-17 juvenil
·                     18-25 adulto

		 */
		
		//VARIÁVEIS
		int idade;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite sua idade");
		idade = kb.nextInt();
		
		//LÓGICA
		if(idade>=10 && idade<=14) 
		{
			System.out.println("Sua categoria é infantil.");
		}
		
		if(idade>=15 && idade<=17) 
		{
			System.out.println("Sua categoria é juvenil.");
		}
		
		if(idade>=18 && idade<=25) 
		{
			System.out.println("Sua categoria é adulta.");
		}
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}