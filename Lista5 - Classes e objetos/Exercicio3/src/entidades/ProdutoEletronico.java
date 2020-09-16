package entidades;

public class ProdutoEletronico {

	
	//ATRIBUTOS
	public String tipo, cor, marca;
	
	//CONSULTOR
	public ProdutoEletronico (String tipo, String cor, String marca)
	{
		this.tipo=tipo;
		this.cor=cor;
		this.marca=marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
