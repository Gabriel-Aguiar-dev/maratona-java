package cursojava;

public class Aula02TiposPrimitivos {

	public static void main(String[] args) {
		int idade = (int) 1000000000;
		long numeroGrande = (long) 155.23;
		double salarioDouble = 2000.00;
		float salarioFloat = (float) 2500.00;
		byte idadeByte = 127;
		short idadeShort = 32000;
		boolean verdadeiro = true;
		boolean falso = false;
		
		String nome = "Gabriel Aguiar Moura";
		
		System.out.println(idade);
		System.out.println(numeroGrande);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println("Meu nome é "+nome);
	}

}