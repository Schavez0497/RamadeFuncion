package Atm.funciones;

public class Operaciones {
    private float totalCordobas;
    private float totalDolares;

    public Operaciones() {
    }

    public float getTotalCordobas() {
        return totalCordobas;
    }

    public float getTotalDolares() {
        return totalDolares;
    }

    public void guardarMonto(TIPOMONEDA moneda, float monto) {
        if (moneda == TIPOMONEDA.DOLARES) this.totalDolares += monto;
        totalCordobas += monto;
    }

    public void retirar(TIPOMONEDA tipomoneda, float monto) {
        if (compararMonto(monto, totalDolares)) {
            if (tipomoneda == TIPOMONEDA.DOLARES) {

                totalDolares -= monto;
                System.out.println("Se retiro:" + monto);
                mostrarMensaje(tipomoneda);
            }else {
                totalCordobas-=monto;
                mostrarMensaje(tipomoneda);
            }

        }else {
            System.out.println("Monto a retirar invalido");
        }

    }

    public String consultarSaldo(TIPOMONEDA tipomoneda) {
        if (tipomoneda == TIPOMONEDA.DOLARES) {
            return TIPOMONEDA.DOLARES.getMoneda() + getTotalDolares();
        }
        return TIPOMONEDA.CORDOBAS.getMoneda() + getTotalCordobas();
    }

    private boolean compararMonto(float monto, float total) {
        if (monto > total) {
            return false;
        }
        return true;
    }

    private void mostrarMensaje(TIPOMONEDA tipomoneda){
        if (tipomoneda==TIPOMONEDA.DOLARES){
            System.out.println("Saldo actual:" + getTotalDolares() + TIPOMONEDA.DOLARES);
        }else {
            System.out.println("Saldo actual:" + getTotalCordobas() + TIPOMONEDA.CORDOBAS);
        }
    }
}
