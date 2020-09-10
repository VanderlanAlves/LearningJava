import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		//VARIÁVEIS
		int numero1, numero2, numero3, aux;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite o primeiro número: ");
		numero1=kb.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2=kb.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3=kb.nextInt();
		
		
		//LÓGICA
	    if(numero1 > numero2) 
	    {
	        aux = numero1;
	        numero1 = numero2;
	        numero2 = aux;
	    }
	    
	    if(numero1 > numero3)
	    {
	        aux = numero1;
	        numero1 = numero3;
	        numero3 = aux;
	    }
	    
	    if(numero2 > numero3)
	    {
	        aux = numero2;
	        numero2 = numero3;
	        numero3 = aux;
	    }
	    		
		
		//SAÍDA
	    System.out.printf("%d - %d - %d",numero1,numero2,numero3);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
		
	}

}
