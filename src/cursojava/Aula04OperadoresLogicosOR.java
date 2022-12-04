package cursojava;

public class Aula04OperadoresLogicosOR {

	public static void main(String[] args) {
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
		System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
	}

}
