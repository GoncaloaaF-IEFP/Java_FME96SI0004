public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        olaMundo();
        olaMundo();
        olaMundo();
        System.out.println("----------------------------------------");
        String msg = olaMundo2();
        System.out.println(msg);

        System.out.println(olaMundo2());
        System.out.println("----------------------------------------");
        System.out.println(olaMundo3("Gonçalo"));
        System.out.println(olaMundo3("Rui"));
        System.out.println(olaMundo3("Ana"));

        System.out.println("----------------------------------------");

        System.out.println(olaMundo4("Gonçalo", 2025));


        System.out.println("----------------------------------------");
        olaMundo();
        olaMundo("func com overload");

    }

    public static void olaMundo() {

        System.out.println("Ola Mundo! - 1ª func");
    }


    public static void olaMundo(String msg) {

        System.out.println(msg);
    }

    public static String olaMundo2() {

        return "Ola Mundo! - 2ª func com retorno";
    }


    public static String olaMundo3(String nome) {

        return "Ola Mundo! "+ nome + " - 3ª func com retorno";
    }


    public static String olaMundo4(String nome, int ano) {

        return "Ola Mundo! "+ nome + " em " + ano +  " - 4ª func com retorno";
    }



}