public class Main {
    public static void main(String[] args) {
        int valores[] = new int[5];
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("array[i]");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("valores que toma i");
        for(int i = 0; i < valores.length; i++){
            System.out.println(i);
        }
        System.out.println("Contador de 1 a 10");
        for (int contador = 1;contador <= 10;contador++){
            System.out.println(contador);
        }
    }
}