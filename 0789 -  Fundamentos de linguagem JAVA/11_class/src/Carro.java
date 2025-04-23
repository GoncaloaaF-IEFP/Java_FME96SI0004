import javax.swing.*;

public class Carro {
    public String marca;
    public String modelo;
    private boolean ligado;


    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar(){
        if (!this.ligado) {

            this.ligado = true;
            System.out.println("O carro foi ligado");

        }else {

            System.out.println("O carro já está ligado");
        }
    }


    @Override
    public String toString() {

        String msg = "Desligado";

        if (this.ligado) {
            msg = "Ligado";
        }
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nEstado: " + msg;
    }
}
