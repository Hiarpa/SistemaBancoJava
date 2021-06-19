package classes;

import interfaces.Contas;

abstract class ContaGeral implements Contas {
    private double saldo;
    private Cliente cliente;


    public double depositar(double quantia){
        System.out.println("O deposito foi realizado com sucesso!");
        return saldo += quantia;
    }
    public double sacar(double quantia){
        System.out.println("O saque foi realizado com sucesso!");
        return saldo -= quantia;
    }
    public double consultarSaldo(){
        System.out.println("Você possui R$" + saldo + ".");
        return saldo;
    }
}

