package entidades;

public class Pessoas 
{

	/*
	 * 1. Crie uma Classe Pessoa, contendo os atributos encapsulados, 
	 * com seus respectivos seletores (getters) e modificadores (setters), 
	 * e ainda o construtor padrão e pelo menos mais duas opções de construtores 
	 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
	 */
	
	//ATRIBUTOS
	public String nome, endereco, telefone;
	public char sexo;
	
	//CONSTRUTORES
	public Pessoas()
	{
		
	}
	
	public Pessoas(String nome, String endereco, String telefone)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	
	public Pessoas(char sexo)
	{
		this.sexo=sexo;
	}

	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
