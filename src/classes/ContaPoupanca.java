package classes;


public class ContaPoupanca extends ContaGeral {
    private double saldo;
    private Cliente cliente;
    private float taxaJuros;

    public ContaPoupanca(double saldo, Cliente cliente, float taxaJuros) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double depositar(double quantia) {
        return super.depositar(quantia);
    }

    @Override
    public double sacar(double quantia) {
        return super.sacar(quantia);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    public double recolherJuros(){
        saldo += saldo*(taxaJuros/100);
        System.out.println("O seu saldo com juros é de R$" + saldo + ".");
        return saldo;
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

    public float getTaxaJuros() {
        return taxaJuros;
    }

}
