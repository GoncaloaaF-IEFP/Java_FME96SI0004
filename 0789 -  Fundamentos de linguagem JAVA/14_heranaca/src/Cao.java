
// class filha
public class Cao extends Animal{

    String raca;

    public Cao(int id, String name, int age, String raca) {
        super(id, name, age);
        this.raca = raca;

        // super.name = "";
    }

    @Override
    public void eat(){
        System.out.println("o cao esta a comer");
    }



    @Override
    public String toString() {
        return "Cao{"+ "name=" + super.name + " raca=" + raca + '}';
    }
}
