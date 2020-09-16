package entidades;

public class Aviao {
		
		/*
		 * Crie uma classe avião e apresente os atributos 
		 * e métodos referentes esta classe, em seguida crie 
		 * um objeto avião, defina as instâncias deste objeto e 
		 * apresente as informações deste objeto no console.
		 */
		
		//ATRIBUTOS
		public String modelo, piloto;
		public int anoFabricacao;
		
		//CONSULTOR
		public Aviao (String modelo, String piloto, int anoFabricacao)
		{
			this.modelo=modelo;
			this.piloto=piloto;
			this.anoFabricacao=anoFabricacao;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPiloto() {
			return piloto;
		}

		public void setPiloto(String piloto) {
			this.piloto = piloto;
		}

		public int getAnoFabricacao() {
			return anoFabricacao;
		}

		public void setAnoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}

		//MÉTODOS
	
}
