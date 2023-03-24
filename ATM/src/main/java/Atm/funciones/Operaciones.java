package Atm.funciones;

public class Operaciones {
    private float totalCordobas;
    private float todalDolares;

    public Operaciones() {
    }

    public float getTotalCordobas() {
        return totalCordobas;
    }

    public float getTodalDolares() {
        return todalDolares;
    }

    public void guardarMonto(TIPOMONEDA moneda, float monto) {
        if (moneda == TIPOMONEDA.DOLARES) this.todalDolares += monto;
        totalCordobas += monto;
    }

    public void retirar(TIPOMONEDA tipomoneda, float monto) {
        if (compararMonto(monto, todalDolares)) {
            if (tipomoneda == TIPOMONEDA.DOLARES) {

                todalDolares -= monto;
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
            return TIPOMONEDA.DOLARES.getMoneda() + getTodalDolares();
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
            System.out.println("Saldo actual:" + getTodalDolares() + TIPOMONEDA.DOLARES);
        }else {
            System.out.println("Saldo actual:" + getTotalCordobas() + TIPOMONEDA.CORDOBAS);
        }
    }
}
