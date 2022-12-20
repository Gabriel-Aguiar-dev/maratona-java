package cursojava.introducao.javacore.Aintroducaoclasses.teste;

import cursojava.introducao.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "Omologata";
        carro1.ano = 2020;

        carro2.nome = "Lamborghini";
        carro2.modelo = "Huracán";
        carro2.ano = 2014;


        carro1 = carro2;

        System.out.println("----------- CARRO 1 -----------");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("----------- CARRO 2 -----------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
