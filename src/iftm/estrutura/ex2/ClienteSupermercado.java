package iftm.estrutura.ex2;


public class ClienteSupermercado implements Comparable<ClienteSupermercado > {

    private String nome;
    private Integer prioridade;

    public ClienteSupermercado () {}
    

    public ClienteSupermercado (String nome, Integer prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "(" + nome + ", " + prioridade + ")";
    }

    @Override
    public int compareTo(ClienteSupermercado  o) {
        return this.prioridade.compareTo(o.getPrioridade());
    }

}