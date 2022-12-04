package cursojava;

public class Aula05EstruturasCondicionais02ElseIf {

	public static void main(String[] args) {
		// idade < 15 categoria infantil
		// idade >= 15 && idade idade < 18 categoria juvenil
		// idade > 18 categoria adulto

		/*
		 * int idade = 18;
		 * 
		 * if (idade < 15) { System.out.println("Categoria Infantil"); } else if (idade
		 * >= 15 && idade < 18) { System.out.println("Categoria Juvenil"); } else {
		 * System.out.println("Categoria Adulto"); }
		 */

//      FORMA SIMPLIFICADA 

		int idade = 16;
		String categoria;

		if (idade < 15) {
			categoria = "Categoria Infantil";
		} else if (idade >= 15 && idade < 18) {
			categoria = "Categoria Juvenil";
		} else {
			categoria = "Categoria Adulto";
		}
		
		System.out.println(categoria);
		
	}
}