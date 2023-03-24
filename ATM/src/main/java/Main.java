import Atm.funciones.Deposito;
import Atm.funciones.Retiro;
import Atm.funciones.TIPOMONEDA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************************************");
        System.out.println("¿Qué transacción desea realizar ?:");
        opcionesATM();
    }

    public static void opcionesATM() {
        int opcion = 0;
        int opcionMoneda = 0;
        TIPOMONEDA tipomoneda = null;

        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMoneda = new Scanner(System.in);

        opcionMoneda();
        opcionMoneda = scannerMoneda.nextInt();
        if (opcionMoneda==1){
            tipomoneda=TIPOMONEDA.DOLARES;
        }
        else {
            tipomoneda=TIPOMONEDA.CORDOBAS;
        }
        while(true) {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Deposito deposito=new Deposito();
                    System.out.println("Monto a depositar:");
                    float monto=scanner.nextFloat();
                    deposito.depositar(tipomoneda,monto);

                    break;
                case 2:
                    Retiro retiro=new Retiro();
                    System.out.println("Monto a retirar:");
                    monto=scanner.nextFloat();
                    retiro.retirar(tipomoneda,monto);
                    break;
                case 3:

                    System.out.println("Consulta:");

                    break;
                default:
                    break;
            }

            String salir = "";

            System.out.println("Desea Continuar (S/N):");
            salir = scannerString.nextLine();
            if (salir.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("**************************************************************");
        System.out.println("Menu");
        System.out.println("**************************************************************");
        System.out.println("1) Deposito");
        System.out.println("2) Retiro");
        System.out.println("3) Ver Saldo");
        System.out.println("**************************************************************");
    }

    public static void opcionMoneda() {
        System.out.println("**************************************************************");
        System.out.println("Moneda");
        System.out.println("**************************************************************");
        System.out.println("1) Dólar");
        System.out.println("2) Cordóba");
        System.out.println("**************************************************************");


    }
}