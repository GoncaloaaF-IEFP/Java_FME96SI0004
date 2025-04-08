import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
            nextBoolean()	Reads a boolean value from the user
            nextByte()	    Reads a byte value from the user
                nextDouble()	Reads a double value from the user
                nextFloat()	    Reads a float value from the user
                nextInt()	    Reads a int value from the user
                nextLine()	    Reads a String value from the user
            nextLong()	    Reads a long value from the user
            nextShort()     Reads a short value from the user
         */
        System.out.print("nome: ");
        String nome = read.nextLine(); // nextLine(); -> le uma str, txt
       // String nome2 = read.nextLine();

        System.out.print("idade: ");
        int idade = read.nextInt();
        read.nextLine();

        boolean insc;

        do {

            System.out.print("Inscrito (y/n)? ");
            String inscrito = read.nextLine();

            if (inscrito.equalsIgnoreCase("yes") || inscrito.equalsIgnoreCase("y")) {

                insc = true;
                break;
            } else if ((inscrito.equalsIgnoreCase("no") || inscrito.equalsIgnoreCase("n"))) {

                insc = false;
                break;

            } else {
                System.out.println("resposta invalida");

            }
        }while (true);


        System.out.println("o teu nome é: " + nome + ", idade: " + idade + ", inscrito: " + insc);
        // System.out.println("o teu nome é:  \{nome}, idade: \{idade} inscrito: \{insc}"); <- nao funciona no java 24





    }
}