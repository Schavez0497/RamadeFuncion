package Atm.funciones;

public class Consulta {

    public void consultar(TIPOMONEDA tipomoneda)
    {
        Operaciones op = new Operaciones();
            System.out.println(op.consultarSaldo(tipomoneda));
    }
}
