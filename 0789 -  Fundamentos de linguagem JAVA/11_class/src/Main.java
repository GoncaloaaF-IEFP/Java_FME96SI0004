
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Gonçalo";
        p.idade = 25;

        System.out.println("o " + p.nome + " tem " + p.idade + " anos");


        Carro c;
        c = new Carro("Ford", "Fiesta");

        System.out.println("Marca: " + c.marca + "\nModelo: " + c.modelo);

        System.out.println("------");

        Carro c2 = new Carro("Fiat", "Uno");
        Carro c3 = new Carro("Chevrolet", "Camaro");
        Carro c4 = new Carro("BMW", "M3");


        System.out.println(c2);
        System.out.println("------");
        c2.ligar();
        System.out.println("------");
        System.out.println(c2);

        System.out.println("------");
        c2.ligar();
        System.out.println("------");
        System.out.println(c2);


    } // end main
} // end class