import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. Total de pessoas
		 * com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		
		//VARIÁVEIS
		int idade=0, cont50=0, cont21=0, STOP=-99;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//LÓGICA
		while(idade!=STOP)
		{
			System.out.println("Digite as idades: ");
			idade = kb.nextInt();
			
			if(idade<21)
			{
				cont21++;
			}
			
			if(idade>50)
			{
				cont50++;
			}
		}
		
		System.out.printf("Há %d pessoas menores de 21 anos e %d pessoas com mais de 50 anos. ", cont21-1, cont50);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}
