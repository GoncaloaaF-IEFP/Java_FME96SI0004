import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal an = new Animal(1,"ZeCao", 12);

        System.out.println(an.name);
        System.out.println(an.age);

        Cao cao = new Cao(2,"Boby", 1, "Boxer");

        System.out.println(cao.name);


        System.out.println(an);
        System.out.println(cao);


        an.eat();
        cao.eat();


        ArrayList<Animal> animals = new ArrayList<>();


        animals.add(an);
        animals.add(new Animal(3,"ZeCao", 12));
        System.out.println("--------------------");
        for (Animal animal: animals){
            System.out.println(animal);
        }

        System.out.println("--------------------");

        an.name = "Sem nome";
        for (Animal animal: animals){
            System.out.println(animal);
        }


        System.out.println("--------------------");

        System.out.println("--------------------");

        ArrayList<Animal> animals2 = new ArrayList<>();

        animals2.add(new Animal(3,"ZeCao", 12));
        animals2.add(new Cao(2,"Boby", 1, "Boxer"));
        animals2.add(new Gato(45, "Gato", 2));  animals2.add(an);


        System.out.println("--------------------");
        for (Animal animal: animals2){
            System.out.println(animal);
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println(cao instanceof Animal);

        System.out.println(animals2.get(2) instanceof Animal);
        System.out.println(animals2.get(2) instanceof Cao);
        System.out.println(animals2.get(2) instanceof Gato);

        if(animals2.get(2) instanceof Gato ){
            Gato novoGato = (Gato)animals2.get(2);
            novoGato.miar();

        }

    }
}