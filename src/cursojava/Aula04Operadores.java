package cursojava;

public class Aula04Operadores {

	public static void main(String[] args) {
/*

	       <         >
	     menor     maior


	    <=               >=
	menor igual     maior igual


	             ==
	         comparação 

	      
	             !=
	         diferente 
	         
*/

	boolean isDezMaiorQueVinte = 10 > 20;
	boolean isDezMenorQueVinte = 10 < 20;
	boolean isDezIgualVinte = 10 == 20;
	boolean isDezIgualDez = 10 == 10;
	boolean isDezDiferente = 10 != 10;
	System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
	System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
	System.out.println("isDezIgualVinte "+isDezIgualVinte);
	System.out.println("isDezIgualDez "+isDezIgualDez);
	System.out.println("isDezDiferente "+isDezDiferente);

	}

}
