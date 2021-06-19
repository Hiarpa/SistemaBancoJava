import classes.Cliente;
import classes.ContaCorrente;
import classes.ContaPoupanca;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1,"Neto",6130502,30320);
        Cliente c2 = new Cliente(2,"Evandro",97655,5364);
        Cliente c3 = new Cliente(3,"Silva", 323,323);
        Cliente c4 = new Cliente(4,"Vando",32323,576);
        ContaCorrente cc1 = new ContaCorrente(100,c1,150);
        ContaPoupanca cp1 = new ContaPoupanca(200,c2,10);
        ContaCorrente cc2 = new ContaCorrente(500,c3,300);


        List<ContaCorrente> lista = new ArrayList<>();
        Set<Cliente> conjunto = new HashSet<>();
        Map<Integer,Cliente> mapa = new HashMap<>();

        lista.add(cc1);
        lista.add(cc2);
        conjunto.add(c2);
        conjunto.add(c1);
        conjunto.add(c1);
        mapa.put(1,c1);
        mapa.put(2,c2);
        mapa.put(3,c1);

        c1.adicionarCliente(1,c1);
        c2.adicionarCliente(2,c2);
        c3.adicionarCliente(3,c3);
        c4.adicionarCliente(4,c4);
        c2.buscaCliente(1);
    }
}
