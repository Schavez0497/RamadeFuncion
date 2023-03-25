package Atm.funciones;

public class Operaciones {
    private static Operaciones operaciones;
    private float totalCordobas = 0;
    private float totalDolares = 0;

    private Operaciones() {
    }

    public static Operaciones NewOperacion() {
        if (operaciones == null) operaciones = new Operaciones();
        return operaciones;
    }

    public float getTotalCordobas() {
        return totalCordobas;
    }

    public float getTotalDolares() {
        return totalDolares;
    }

    public void guardarMonto(TIPOMONEDA moneda, float monto) {
        if (moneda == TIPOMONEDA.DOLARES) {
            this.totalDolares += monto;
        } else {
            this.totalCordobas += monto;
        }
    }

    public void retirar(TIPOMONEDA tipomoneda, float monto) {
        if (compararMonto(monto, this.totalDolares)) {
            if (tipomoneda == TIPOMONEDA.DOLARES) {
                this.totalDolares -= monto;
            } else {
                this.totalCordobas -= monto;
            }

        } else {
            System.out.println("Monto a retirar invalido");
        }

    }

    public String consultarSaldo(TIPOMONEDA tipomoneda) {
        if (tipomoneda == TIPOMONEDA.DOLARES) {
            return "Saldo actual: " + TIPOMONEDA.DOLARES.getMoneda() + " " + getTotalDolares();
        }
        return "Saldo actual: " + TIPOMONEDA.CORDOBAS.getMoneda() + " " + getTotalCordobas();
    }

    private boolean compararMonto(float monto, float total) {
        if (monto > total) {
            return false;
        }
        return true;
    }

    private void mostrarMensaje(TIPOMONEDA tipomoneda) {
        if (tipomoneda == TIPOMONEDA.DOLARES) {
            System.out.println("Saldo actual: " + TIPOMONEDA.DOLARES.getMoneda() + " " + getTotalDolares());
        } else {
            System.out.println("Saldo actual: " + TIPOMONEDA.CORDOBAS.getMoneda()  + " "  + getTotalCordobas());
        }
    }
}
