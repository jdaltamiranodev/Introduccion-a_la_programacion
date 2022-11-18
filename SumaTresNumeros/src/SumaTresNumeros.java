public class SumaTresNumeros {
    public static void main(String[] args) {
        int num1 = 5, num2 = 4, num3 = 8, result;

        result = suma(num1, num2, num3);
        System.out.println(result);
    }

    public static int suma(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;

        return resultado;
    }
}
