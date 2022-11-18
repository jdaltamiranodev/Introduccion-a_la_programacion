public class Main {
    public static void main(String[] args) {
        var estacion = "VERANO";

        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Ingresó una opción invalida");
        }

        System.out.println("NUEVA FORMA DE HACERLO");
        //var estacion = "OTOÑO";
        switch (estacion) {
            case "VERANO" -> System.out.println("Es verano");
            case "INVIERNO" -> System.out.println("Es invierno");
            case "OTOÑO" -> System.out.println("Es otoño");
            case "PRIMAVERA" -> System.out.println("Es primavera");
            default -> System.out.println("Ingresó una opción invalida");
        }
        System.out.println("Hello world!");
    }
}