import java.util.Scanner;


public class ConvertirCurrency {

    // Metodo que convierte las monedas
    public static void convertir(String monedaBase, String monedaTarget, ConsultaDeMoneda consulta, Scanner input){
    
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.BusquedaDeMoneda(monedaBase, monedaTarget);
        System.out.println("Conversion de hoy\n"+ monedaBase + " a " + moneda.conversion_rate() +" "+ monedaTarget);
        System.out.println("Ingrese la cantidad de monedas: "+ monedaBase);
        cantidad = Double.parseDouble(input.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println("Cantidad de la moneda base: " + cantidad + " " + monedaBase + " Son igual a= " + cantidadConvertida +" "+ monedaTarget +" " + "Valor de moneda por cada "+ monedaBase+ " = "+ moneda.conversion_rate()+ " " +monedaTarget);
    }

    // Metodo que te hace escribir la moneBase y la monedaTarget para que al final llames al metodo convertir con los datos que se le proporcionaron en la interaccion con el usuario
    public static void convertirOtraMoneda(ConsultaDeMoneda consulta, Scanner input){

        System.out.println("Ingresa el nombre de la moneda base: ");
        String monedaBase = input.nextLine().toLowerCase();
        
        System.out.println("Ingresa la moneda que quiere pasar el dato:");
        String monedaObjetivo = input.nextLine().toLowerCase();
        convertir(monedaBase, monedaObjetivo, consulta, input);
    }
}
