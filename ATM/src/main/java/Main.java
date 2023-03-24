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

        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMoneda = new Scanner(System.in);

        while(true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    opcionMoneda();
                    opcionMoneda = scannerMoneda.nextInt();
                    switch (opcionMoneda) {
                        case 1:
                            System.out.println("Dólar");
                            break;
                        case 2:
                            System.out.println("Cordóbas");
                            opcionMoneda();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    opcionMoneda();
                    opcionMoneda = scannerMoneda.nextInt();
                    switch (opcionMoneda) {
                        case 1:
                            System.out.println("Dólar");
                            break;
                        case 2:
                            System.out.println("Cordóbas");
                            opcionMoneda();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ver Saldo");
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