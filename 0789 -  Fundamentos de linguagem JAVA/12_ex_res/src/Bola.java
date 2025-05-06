/*

 Classe Bola: Crie uma classe que modele uma bola:

 Atributos:
     Cor,
     circunferencia,
     material
 Métodos:
     trocaCor
     mostraCor

  */



public class Bola {

    String cor;
    float circunferencia;
    String material;

    public Bola(String cor, float circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    void trocaCor(String novaCor){
        this.cor = novaCor;
    }

    void mostraCor(){
        System.out.println("a cor da bola é " + this.cor);
    }


}
