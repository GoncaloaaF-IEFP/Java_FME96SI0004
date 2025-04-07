public class Main {
    public static void main(String[] args) {

        int valA = 10;
        int valB = 10;



        /*
            0 -> false
            1 -> true


                and     or     xor
          0 0    F      F       F
          0 1    F      V       T
          1 0    F      V       T
          1 1    T      V       F


         */

        if (valA > valB) {
            System.out.println("o valA e maior que o valB");
        }else if (valA == valB) {
            System.out.println("o valA e igual ao valB");
        }else {
            System.out.println("o valA e menor que o valB");
        }

        System.out.println("------------ separador -----------------");

        valA = 10;
        valB = 10;

        if (valA >= valB) {
            System.out.println("o valA e maior que o valB");
        }else if (valA == valB) {
            System.out.println("o valA e igual ao valB");
        }else {
            System.out.println("o valA e menor que o valB");
        }

        System.out.println("------------ separador -----------------");

        int idade = 19;

        if (idade >= 18){
            System.out.println("Adulto");

        }else if (idade > 12) {
            System.out.println("Teen");

        }else{
            System.out.println("Criança");

        }

        System.out.println("------------ separador -----------------");

        idade = 19;

        if (idade >= 18){
            System.out.println("Adulto");

        }

        if (idade > 12) {
            System.out.println("Teen");

        }else{
            System.out.println("Criança");

        }

        System.out.println("------------ separador -----------------");

        int mes = 11;

        switch (mes){
            case 1:
                System.out.println("Janeiro");

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            default:
                System.out.println("Mês invalido");
        }


        int mes2 = 10;
        int ano = 2020;

        if (mes2 == 12){

        } else if (ano > 2020) {

        } else if (idade == 30) {

        }

        System.out.println("------------ separador -----------------");

        mes2 = 12;
        ano = 2020;
        idade = 20;

        if ((mes2 == 12 && ano == 2021) || idade == 20 ) {
            System.out.println("ok");
        }else{
            System.out.println("nao ok");

        }

    }
}