package cursojava.introducao.javacore.Aintroducaoclasses.Bintroducaoclasses.teste;

import cursojava.introducao.javacore.Aintroducaoclasses.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Fim do programa somaDoisNumeros");
        calculadora.subtraiDoisNumeros();
    }
}
