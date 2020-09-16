package application;

import entidades.ProdutoEletronico;

public class Main {

	public static void main(String[] args) {
		ProdutoEletronico produto1 = new ProdutoEletronico("Celular", "Cinza", "Samsung");
		
		System.out.println(produto1.getTipo());
		System.out.println(produto1.getCor());
		System.out.println(produto1.getMarca());


	}

}