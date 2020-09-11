import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 
		 *Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 *
		 */

		//VARIÁVEIS
		int i;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		

		//LÓGICA E SAÍDA
		for(i=1000; i<=1999;i++)
		{
			if(i%11==5)
			{
				System.out.printf("\n %d", i);
			}
			
		}
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}