import java.util.ArrayList;

public class Gato extends Animal {
    public Gato(int id, String name, int age) {
        super(id, name, age);
    }

    public void  miar(){
        System.out.println("Miar");
    }

    @Override
    public String toString() {
        return "Gato{ name = " + super.name +  "}";
    }

}
