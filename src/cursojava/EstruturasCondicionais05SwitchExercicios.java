package cursojava;

public class EstruturasCondicionais05SwitchExercicios {

	public static void main(String[] args) {
		// Ultilizando switch e dados os valores de 1 a 7, imprima se e dia util ou final e semana 
		// Considerando um como domingo
		
		
		// Corecao
		byte dia = 3;
		
		switch (dia) {
		case 1:
		case 7:
			System.out.println("Final de semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia util");
			break;
			default: 
				System.out.println("Opcao invalida");
	}

}
}