import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do codigo");
        // cmt com 1 linha

        /*

        comt
        com
        varias
        linhas

         */

        System.out.println("Gonçalo");// print com mudança de linha
        System.out.println(10);

        System.out.print("-- Ola Munod --"); // print sem mudar de linha

        System.out.println("Ola Mundo, " + 2024);

        System.out.println("-------------------");

        System.out.println("linha 1\nlinha 2");

        // \t -> tab (4 espaços)
        // \n -> muda de linha
        System.out.println("\tlinha 1\nlinha 2");

        System.out.println("Fim do codigo");


        System.out.println("-------- var e tipos de dados ----------");

        /*

            int     - inteiros -> -2147483648 to  2 147 483 647
            long    - inteiros -> max -> 9 223 372 036 854 775 807
            float   - decimais (6/7 cd)
            double  - decimais ( 12/15 cd )
            String  - "txt"
            Boolean - T / F

         */

        // tipo nome [= valor];

        char l = 'f'; // '' -> char
        System.out.println("letra = " + l);

        // char l2 = "f";  <- " "  -> String
        // System.out.println("letra = " + l2);

        int idade;
        int idade2 = 29;

        System.out.println("idade = " + idade2);

        idade = 123;
        System.out.println("idade v2 = " + idade);


        double salario = 12.331;
        System.out.println("salario = " + salario);


        boolean aprovado = false;
        System.out.println("aprovado = " + aprovado);

       //boolean aprovado2 = 1;
       //System.out.println("aprovado = " + aprovado2);

        String nome = "Maria";
        System.out.println("nome = " + nome);

        System.out.println("--------------- mudar var --------------");

        int novoIdade = 10;
        double novoSalario = 12.21;
        boolean novoAprovado = true;
        String novoNome = "Maria";

        System.out.println("novoIdade 1 = " + novoIdade);

        novoIdade = 99;

        System.out.println("novoIdade 2 = " + novoIdade);

       // novoIdade = 99.23; <- não é possivel, novoIdade é int

        System.out.println("novoSalario 1 = " + novoSalario);

        novoSalario = 99.12;

        System.out.println("novoSalario 2 = " + novoSalario);

        novoSalario = 99;

        System.out.println("novoSalario 2 = " + novoSalario);


        double teste_d = 10.2;
        float  teste_f = 10.2f;


        novoNome = "Rita";
        System.out.println("novoNome = " + novoNome.toLowerCase());

        System.out.println("--------------- final var --------------");

        final int num = 10;
        // num = 123; ->  final int -> criar uma constante

        System.out.println("--------------- Operações com var --------------");


        int i = 10;
        double d = 10.5;
        float f = 10.2f;

        System.out.println(i + d);
        System.out.println(f + d);

        System.out.println(i / 3);
        System.out.println(i / 3.0);



        System.out.println("--------------- inc --------------");

        i = i + 1;
        i += 1;
        i++;


        i = i - 1;
        i -= 1;
        i--;



        i = i * 5;
        i *= 5;


        i = i / 5;
        i /= 5;


    }
}