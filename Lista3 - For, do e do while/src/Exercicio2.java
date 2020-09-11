import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		//VARIÁVEIS
		int i, numero=0, contPar=0, contImpar=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);

		
		//ENTRADA
		
		
		
		//LÓGICA
		for(i=0; i<10; i++)
		{
			System.out.println("Digite um número: ");
			numero = kb.nextInt();
			
			if(numero%2==0) 
			{
				contPar++;
			}
			
			else
			{
				contImpar++;
			}
		}
		
		System.out.printf("\nEntre os 10 números digitados, há %d pares e %d ímpares. ", contPar, contImpar);
		
		
		//SAÍDA
		
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}

