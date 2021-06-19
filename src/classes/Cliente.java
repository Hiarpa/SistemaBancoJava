package classes;


import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private int id;
    private String sobrenome;
    private int rg;
    private int cpf;

    private Map<Integer, Cliente> listaClientes = new HashMap<>();

    public Cliente(int id, String sobrenome, int rg, int cpf) {
        this.id = id;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public void adicionarCliente(int idCliente, Cliente cliente){
        this.listaClientes.put(idCliente, cliente);
    }

    public Cliente buscaCliente(int idCliente){
        Cliente clienteBuscado = this.listaClientes.get(idCliente);
        return clienteBuscado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
