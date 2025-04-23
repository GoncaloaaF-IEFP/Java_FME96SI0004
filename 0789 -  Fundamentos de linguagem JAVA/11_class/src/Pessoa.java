public class Pessoa {
    String nome;
    int idade;


    @Override
    public String toString() {
        return "o " + this.nome + " tem " + this.idade + " anos";
    }
}
