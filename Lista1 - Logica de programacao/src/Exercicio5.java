import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
         * aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
         * respectivamente.
		 */
		
		//VARIÁVEIS
		double N1, N2, N3, media;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
				
		//ENTRADA
		System.out.println("Digite a primeira nota: ");
		N1 = kb.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		N2 = kb.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		N3 = kb.nextDouble();
		
		//CONTAS
		media=((N1*2)+(N2*3)+(N3*5))/10;
				
		//SAÍDA
		System.out.printf("A média ponderada das notas digitadas é: %.2f", media);
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
