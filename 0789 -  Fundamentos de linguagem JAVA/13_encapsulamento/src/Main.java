
public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Ford", "Fiesta", 2018);

        System.out.println(c1.toString());
        System.out.println(c1);


        System.out.println(c1.getAno());

        c1.setAno(1000);
        System.out.println(c1);


        c1.setMarca("abcd");

        System.out.println(c1);


        c1.deslocar("Porto");

    }
}