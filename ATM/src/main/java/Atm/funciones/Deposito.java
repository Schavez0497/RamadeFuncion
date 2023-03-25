package Atm.funciones;

public class Deposito {

    public void depositar (TIPOMONEDA tipomoneda,float cantidad) {
        Operaciones operaciones = Operaciones.NewOperacion();
        operaciones.guardarMonto(tipomoneda,cantidad);
        System.out.println("Deposito realizado con Exito");
        if (tipomoneda==TIPOMONEDA.DOLARES){
            System.out.println("Saldo actual " + operaciones.getTotalDolares());
        }
        System.out.println("Saldo actual " + operaciones.getTotalCordobas());
        
    }

}


