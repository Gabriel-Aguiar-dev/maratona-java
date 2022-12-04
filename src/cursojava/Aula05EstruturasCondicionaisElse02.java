package cursojava;

public class Aula05EstruturasCondicionaisElse02 {

	public static void main(String[] args) {

		int idade = 19;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcolica");
		} else {
			System.out.println("Nao autorizado a comprar bebida alcolica");
		}

	}

}
