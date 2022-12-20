package cursojava.introducao.javacore.Aintroducaoclasses.teste;

import cursojava.introducao.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Gabriel";
        estudante1.idade = 16;
        estudante1.sexo = 'M';
        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("-------------------------");

        estudante2.nome = "Viviane";
        estudante2.idade = 21;
        estudante2.sexo = 'F';
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);


    }

}
