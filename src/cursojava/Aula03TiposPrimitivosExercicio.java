package cursojava;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário  de <salário>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
	public static void main(String[] args) {
		String nome = "Gabriel Aguiar";
		String endereco = "Rio de janeiro";
		double salario = 3000.00;
		String dataRecebimentoSalario = "01/09/2023";
		String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário  de "+salario+", na data "+dataRecebimentoSalario;
		System.out.println(relatorio);

}
}