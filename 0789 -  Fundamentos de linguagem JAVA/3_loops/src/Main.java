public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        /*

        while
        do-while

        for


         */


        int i = 0;
        while (i < 100){

            System.out.println("Hello, World! while -> " + i);
            if(i == 50){
                System.out.println("o loop vai terminar");
                break;
            }

            i++;

        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");


        int j = 0;
        do{

            System.out.println("Hello, World! do - while -> " + j);

            j += 1;


        }while (j > 100);


        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");

        // for(init da var ; cond de paragem ; inc/dec ){ Corpo  }



        for (int k = 0; k < 100; k++){


            if (k % 2 == 0){
                System.out.println("O loop vai para a proxima iter");
                continue            ;
            }
            if(k == 50){
                System.out.println("o loop vai terminar");
                break;
            }
            System.out.println("Hello, World! for -> " + k);



        }

        /*

        for(1; 2 ; 3 ){ 4  }

            1

            2
            4
            3

            2
            4
            3


         */

    /*
            num par entre 0 e 10 000 usando:
            for
            while
            do-while


     */











        /*

        explique a linha de codigo:

         int foo = 0;

         */



        int foo = 0;
        foo++;      //foo = foo + 1 -> foo = 0 + 1 -> foo = 1  ->  foo <= 1
        foo--;      // foo = foo - 1 -> foo = 0 - 1 -> foo = -1  ->  foo <= -1
        foo += 5;   //  foo = foo + 5
        foo += 1;   //  foo = foo + 1 <-> foo++




        int l = 0;
        while (l < 10){
            System.out.println("Hello, World! while (Sara) -> " + l);
            l++;

        }

        /*
Supondo que a população de um país A seja da ordem de 80000 habitantes com  uma taxa anual de crescimento de 3%
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.

Faça um programa que calcule e escreva o número de anos necessários para que
 a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.


         */

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50

 */
        /*


        faça um contador de 0 a 100

        faça um contador de 100 a 0


        mostre os num pares de 0 a 100


         */

    }
}