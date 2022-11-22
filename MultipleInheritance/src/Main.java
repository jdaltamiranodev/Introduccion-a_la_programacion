public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Vehiculo {
    int velocidadMaxima;

    public Vehiculo(){
        System.out.println("Estoy en el contructor del vehiculo");
    }
}

class Motor {
    String tipoMotor;
    public Motor(){ System.out.println("Estoy en el constructor de Motor");}
}

class Coche extends Vehiculo, Motor {
    public Coche(){
        
    }
}