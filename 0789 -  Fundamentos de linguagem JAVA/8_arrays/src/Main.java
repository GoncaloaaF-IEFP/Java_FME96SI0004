// null -> sem valor

public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[10];

        String[] nomes2 = {"Gonçalo", "Rui", "Luis", "Ana", "Maria"};



        System.out.println(nomes[5]);
        // System.out.println(nomes2[5]); <-Erro  Index 5 out of bounds

        nomes[0] = "Gonçalo 0 nomes";
        nomes[1] = "Gonçalo 1 nomes";

        System.out.println(nomes[1]);
        System.out.println(nomes[0]);

        int size = nomes.length;
        System.out.println("num elm em nome = " + size);

        int size2 = nomes2.length;
        System.out.println("num elm em nome2 = " + size2);

        
        for (int i = 0; i < nomes2.length; i++) {
            System.out.println("pos "+ i +" = "+ nomes2[i]);
        }


    }
}

