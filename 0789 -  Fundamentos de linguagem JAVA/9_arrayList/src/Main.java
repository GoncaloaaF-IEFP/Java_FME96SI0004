import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes;

        nomes = new ArrayList<String>();

        int nomeSize = nomes.size();

        System.out.println("num ele no array: " + nomeSize);

        nomes.add("Gonçalo");
        nomes.add("Rui");

        nomeSize = nomes.size();
        System.out.println("num ele no array: " + nomeSize);

        System.out.println(nomes);

        nomes.remove(0);

        System.out.println(nomes);

        nomes.add("Gonçalo 1");
        nomes.add("Rui 1");

        nomes.add("Gonçalo 2");
        nomes.add("Rui 2");

        nomes.removeFirst();
        System.out.println(nomes);


        nomes.add(3, "Carlos");
        System.out.println(nomes);

        //nomes.add(100, "Carlos");
        //System.out.println(nomes);


        ArrayList<String> nomes2 = new ArrayList<String>();
        nomes2.add("Maria");
        nomes2.add("Joana");
        nomes2.add("Luisa");

        nomes.addAll(nomes2);


        System.out.println(nomes);

        System.out.println("--------- for nomes ------------");

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println(nomes.get(i));

        }

        System.out.println("--------- for each nomes ------------");


        for(String nome : nomes) {
            System.out.println(nome);
        }














    }
}