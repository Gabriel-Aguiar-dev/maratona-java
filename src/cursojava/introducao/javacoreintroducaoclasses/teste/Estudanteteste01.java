package cursojava.introducao.javacoreintroducaoclasses.teste;

import cursojava.introducao.javacoreintroducaoclasses.dominio.Estudande;

public class Estudanteteste01 {
    public static void main(String[] args) {
        
        Estudande estudande = new Estudande();
        Estudande estudande2 = new Estudande();

        estudande.nome = "Gabriel";
        estudande.idade = 16;
        estudande.sexo = 'M';
        System.out.println(estudande.nome);
        System.out.println(estudande.idade);
        System.out.println(estudande.sexo);

        System.out.println("-------------------");

        estudande2.nome = "Viviane";
        estudande2.idade = 19;
        estudande2.sexo = 'F';
        System.out.println(estudande2.nome);
        System.out.println(estudande2.idade);
        System.out.println(estudande2.sexo);
}
}