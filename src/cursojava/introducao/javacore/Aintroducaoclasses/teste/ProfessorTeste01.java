package cursojava.introducao.javacore.Aintroducaoclasses.teste;

import cursojava.introducao.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Raphael";
        professor.idade = 21;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);

}
}