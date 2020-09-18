package aplicacao;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Principal {

	public static void main(String[] args) 
	{

		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		cachorro1.som();
		cavalo1.som();
		preguica1.som();

}
}