public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    abstract public void setSonido(String sonido);
    abstract public String getSonido();

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}