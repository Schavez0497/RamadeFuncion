package Atm.funciones;

public enum TIPOMONEDA {
    CORDOBAS("c$"), DOLARES("$$");

    private String moneda;

    TIPOMONEDA(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }
}