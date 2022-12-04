package cursojava;

public class EstruturasCondicionais05Switch {
	public static void main(String[] args) {
		// Imprima o dia da semana, considerando 1 como domingo
		byte dia = 19;
		// char, int, byte, short, enum, String

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter");
			break;
		case 4:
			System.out.println("Qua");
			break;
		case 5:
			System.out.println("Qui");
			break;
		case 6:
			System.out.println("Sex");
			break;
		case 7:
			System.out.println("Sab");
			break;
		default:
			System.out.println("Opcao invalida!");
		}
		System.out.println(dia);

		
		
		char sexo = 'M';

		switch (sexo) {
		case 'M':
			System.out.println("Sexo Masculino.");
			break;
		case 'F':
			System.out.println("Sexo Feminino.");
			break;
		default:
			System.out.println("Opcao invalida");
			break;

		}

	}

}
