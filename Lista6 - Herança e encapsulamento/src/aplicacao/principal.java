package aplicacao;

import entidades.Empregados;
import entidades.Fornecedores;
import entidades.Pessoas;

public class principal 
{
	public static void main (String args[]) {
		
	
	Pessoas pessoa1=new Pessoas("Vanda Maria Almeida", "Rua Itajubaquara, 644", "37390075");
	Pessoas pessoa2=new Pessoas('M');
	
	Empregados empregado1=new Empregados(2546, 2500, 300);
	
	Fornecedores fornecedor1=new Fornecedores(0, 5000);
	
	System.out.println("O nome da pessoa é: "+ pessoa1.nome+ "\nSua casa fica na " +pessoa1.endereco+"\nSeu número de telefone é: "+pessoa1.telefone);
	
	System.out.println("\n"+fornecedor1.getObterSaldo());
	
	System.out.println(empregado1.getCalcularSalario());		
	
}

}