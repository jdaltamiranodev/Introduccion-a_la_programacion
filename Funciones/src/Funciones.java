public class Funciones{
    public static void main(String[] args) {
        suma(1, 2);
       // Potato miPotato = new Potato();
        /*int resultado = 0;
        resultado = suma(10, 30);
        System.out.println(resultado);*/
    }
    public static int suma(int a,int b){
        int resultado = a + b;
        System.out.println(resultado);

        return suma(a, resultado);
    }


    /*public static int suma(int a,int b){
        return a + b;
    }*/
}

/*class Potato {
    public int brazos = 0;

    public void QuitarBrazo(){
        this.brazos--;
    }
}*/