public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        CocheElectrico cocheElectrico = new CocheElectrico();
        coche.velocidadMaxima = 14;
        coche.matricula = "ABC 1234 ES";

        System.out.println(cocheElectrico.compruebaMatricula("XXX"));
    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula){
        if (matricula == "XXX"){
            return true;
        }
        return false;
    }
}

class Coche extends Vehiculo {

}

class CocheElectrico extends Coche{

}