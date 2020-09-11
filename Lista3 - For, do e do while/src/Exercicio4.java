import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 
Uma empresa desenvolveu uma pesquisa para saber as características 
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.

		 */
		
		//VARIÁVEIS
		int LIMITE=150, pessoas=0, idade=0, sexo=0, temperamento=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, pessoasNervosas40=0, pessoasCalmas18=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//LÓGICA
		while(pessoas<LIMITE)
		{
			pessoas++;
			
			System.out.println("Digite a idade: ");
			idade = kb.nextInt();
			
			System.out.println("Digite o sexo: 1-Feminino 2-Masculino ");
			sexo = kb.nextInt();
			
			System.out.println("Digite o temperamento: 1-Calma(o) 2-Nervosa(o) 3-Agressiva(o) ");
			temperamento = kb.nextInt();
			
			if(temperamento==1)
			pessoasCalmas++;
			{
				if(idade<18)
				{
					pessoasCalmas18++;
				}
			}
			
			if(temperamento==2)
			{
				if(idade>40)
				{
					pessoasNervosas40++;
			
				}
			}
			
			if(temperamento==3)
			{
				if(sexo==2)
				{
					homensAgressivos++;
				}
			}
			
			if(temperamento==2)
			{
				if(sexo==1)
				{
					mulheresNervosas++;
				}
			}
			
		}
		
		//SAÍDA
		System.out.printf("\nO número de pessoas calmas é de: %d.", pessoasCalmas);
		System.out.printf("\nO número de mulheres nervosas é de: %d.", mulheresNervosas);
		System.out.printf("\nO número de homens agressivos é de: %d.", homensAgressivos);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é de: %d.", pessoasNervosas40);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos é de: %d.", pessoasCalmas18);


		//ENCERRAMENTO DO TECLADO
		kb.close();
	}

}
