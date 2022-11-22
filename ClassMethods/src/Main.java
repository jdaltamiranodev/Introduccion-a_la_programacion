public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        ejecutaAcelear(coche);
        ejecutaAcelear(moto);
        cocheChanger(coche);
    }

    public static void cocheChanger(Coche coche){
        coche.velocidad += 50;
    }

    public static void ejecutaAcelear(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
}

interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    int velocidad = 0;
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche() -> Frenar()");
    }
}

class Moto implements Vehiculo {
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad){
        System.out.println("Moto() -> Frenar()");
    }
}