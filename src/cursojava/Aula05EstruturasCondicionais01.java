package cursojava;

public class Aula05EstruturasCondicionais01 {

	public static void main(String[] args) {
		
		int idade = 19;
		boolean isAutorizadoComprarBebida = idade >= 18;
		
		if (idade >= 18) {
			System.out.println("Autorizado a comprar bebida alcolica");
		}
		
	
		
		if (!isAutorizadoComprarBebida) {
			System.out.println("Nao autorizado a comprar bebida alcolica");
		}
		
		/*  ↕ MESMA COISA ↕
		 
		! se (! negacao)
		 
		if (isAutorizadoComprarBebida == false) {
			System.out.println("Nao autorizado a comprar bebida alcolica");
		}
		
		
		*/
		
		
		
		
		}
}
