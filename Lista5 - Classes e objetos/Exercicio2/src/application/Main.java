package application;

import entidades.Aviao;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("Boeing 747", "Fernando", 1969);
		
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getPiloto());
		System.out.println(aviao1.getAnoFabricacao());

	}

}
