import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Llamamos a la intancia de la clase consultaDeMoneda
        ConsultaDeMoneda consulta = new ConsultaDeMoneda();

        int opcion = 0;

        // Menu de la convercion de monedas con su salida
        while (opcion != 8) {
            System.out.println("**************************************\n"+
            "Bienvenidos al conversor de monedas\n\n"+
            "Ingresa la conversion que quieres realizar!!!\n\n"+
            "1. Dollar a peso Mexicano\n"+
            "2. Peso Mexicano a Dollar\n"+
            "3. Dollar a Peso Argentino\n"+
            "4. Peso Argentino a Dollar\n"+
            "5. Dollar a Peso Colombiano\n"+
            "6. Peso Colombiano a Dollar\n"+
            "7. Dollar a Real Brasileño\n"+
            "8. Real Brasileño a Dollar\n"+
            "9. Convertir otra moneda\n"+
            "10. Salir..................");
            opcion = input.nextInt();
            input.nextLine();

            // Switch para el manejo de las opciones del menu caso por caso 
            switch (opcion) {
                case 1: ConvertirCurrency.convertir("USD", "MXN", consulta, input);break;
                case 2: ConvertirCurrency.convertir("MXN", "USD", consulta, input);break;
                case 3: ConvertirCurrency.convertir("USD", "ARS", consulta, input);break;
                case 4: ConvertirCurrency.convertir("ARS", "USD", consulta, input);break;
                case 5: ConvertirCurrency.convertir("USD", "COP", consulta, input);break;
                case 6: ConvertirCurrency.convertir("COP", "USD", consulta, input);break;
                case 7: ConvertirCurrency.convertir("USD", "BRL", consulta, input);break;
                case 8: ConvertirCurrency.convertir("BRL", "USD", consulta, input);break;
                case 9: ConvertirCurrency.convertirOtraMoneda(consulta, input);break;//Aqui ocupamos el metodo de la clase convertir moneda
                case 10: System.out.println("Saliendo......."); return;//Saliendo de la aplicación
                default: System.out.println("Opcion no valida");break;//Nos regresa al menu para que podamos tener valida otra opción
            }
        }
    }
}
