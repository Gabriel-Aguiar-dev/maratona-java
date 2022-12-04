package cursojava;

public class Aula04OperadoresLogicosAnd {

	public static void main(String[] args) {
		 //&& (AND, i)  || (or, se) ! 
		
		int idade = 29;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 35 && salario >= 3281;
		
		System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
	
	}


}
