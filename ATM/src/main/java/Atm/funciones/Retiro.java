package Atm.funciones;

public class Retiro {
    public void retirar (TIPOMONEDA tipomoneda,float monto) {
        Operaciones operaciones = Operaciones.NewOperacion();
        operaciones.retirar(tipomoneda,monto);
        System.out.println("Su retiro de:" + monto + "exitoso.");
    }
}
