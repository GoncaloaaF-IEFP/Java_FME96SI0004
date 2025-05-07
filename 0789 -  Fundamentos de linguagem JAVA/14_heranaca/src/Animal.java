
// class Pai
public class Animal {
    private int id;
    public String name;
    protected int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Eating...");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
