package classes;

public class ContaCorrente extends ContaGeral{
    private double saldo;
    private Cliente cliente;
    private double chequeEspecial;
    private boolean statusCheque;

    public ContaCorrente(double saldo, Cliente cliente, double chequeEspecial) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.chequeEspecial = chequeEspecial;
        this.statusCheque = true;
    }

    @Override
    public double depositar(double quantia) {
        return super.depositar(quantia);
    }

    @Override
    public double sacar(double quantia) {
        if(saldo >=quantia) {
            return super.sacar(quantia);
        }
        else if (statusCheque && quantia <= saldo + chequeEspecial){
            statusCheque = false;
            chequeEspecial += saldo;
            saldo = 0;
            chequeEspecial -= quantia;
            return chequeEspecial -= quantia;
            /*
            statusCheque = false;
            double fatura = chequeEspecial + chequeEspecial*0.10;
            saldo -= fatura;
            System.out.println("Cheque especial entregue, portanto foi descontado uma fatura do seu saldo.");
            return chequeEspecial;
             */
        }
        else{
            System.out.println("Quantia maior que o saldo!");
            return saldo;
        }
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    public double depositarCheque(Cheque cheque){
        return saldo += cheque.getValor();
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public boolean isStatusCheque() {
        return statusCheque;
    }

}
