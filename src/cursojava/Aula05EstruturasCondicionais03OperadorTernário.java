package cursojava;

public class Aula05EstruturasCondicionais03OperadorTernário {

	public static void main(String[] args) {
		// Doar se o salario for > 5000
		double salario = 7000;
/*		String MensagemDoar = "Eu vou fazer uma doação de R$ 500 pro DevDojo";
		String MensagemNaoDoar = "Ainda nao tenho condiçoes, mas vou ter !";
		String Resultado;

		if (salario > 6000) {
			Resultado = MensagemDoar;
		} else {
			Resultado = MensagemNaoDoar;
		}

		System.out.println(Resultado);
*/
//      FORMA SIMPLIFICADA 	
		// (Condicao) ? verdadeiro : falso

		String resultado = salario > 5000 ? "Eu vou fazer uma doação de R$ 500 pro DevDojo"
				: "Ainda nao tenho condiçoes, mas vou ter !";

		System.out.println(resultado);

	}

}
