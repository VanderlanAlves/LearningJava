
public class Exercicio1 {

	public static void main(String[] args) {
		/*
Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		//(a)
		int[] vetor= {1, 0, 5, -2, -5, 7};
		int i=0, soma=0;
		
		
		//(b)
		soma = vetor[0]+vetor[1]+vetor[5];
		System.out.printf("A soma das posições 0, 1 e 5 do vetor é: %d \n", soma);
		
		
		//(c)
		vetor[4]=100;
		
		
		//(d)
		for(i=0; i<vetor.length; i++)
		{
			System.out.printf("\nA posição %d do vetor vale %d.", i, vetor[i]);
		}
		
		
	}

}
