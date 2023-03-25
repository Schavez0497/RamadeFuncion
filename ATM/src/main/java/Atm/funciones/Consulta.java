package Atm.funciones;

public class Consulta {

    public void consultar(TIPOMONEDA tipomoneda)
    {
        Operaciones op = Operaciones.NewOperacion();
            System.out.println(op.consultarSaldo(tipomoneda));
    }
}
