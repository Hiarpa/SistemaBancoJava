package interfaces;


public interface Contas {
    double depositar(double quantia);
    double sacar(double quantia);
    double consultarSaldo();
}
