
public class principal {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente("Vanda", 34, 555);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getCodigo());

	}

}
