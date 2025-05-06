
public class Carro {
    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    //getter e setter

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {

        if(ano < 1886){
            System.out.println("O ano é invalido");
            return;
        }

        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        if (marca.length() >= 3) {
            this.marca = marca;
        }else {
            System.out.println("A marca é invalida");
        }

    }

    private String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private void ligar(){
        System.out.println("Ligado");
    }

    private void arrancar(){
        System.out.println("a andar");
    }

    private void travar(){
        System.out.println("a travar");
    }
    private void deligar(){
        System.out.println("desligado");
    }

    public void deslocar(String destino){

        ligar();
        arrancar();

        travar();
        deligar();


    }



    @Override
    public String toString() {
        return "marca: " + marca + ", modelo: " + modelo + ", ano: " + ano;
    }





}
