package Entidades;

public class Headphone extends Produto {
    private long id;
    private String nome;
    private String modelo;
    private int preco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Headphone(long id, String nome, String modelo, int preco) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }
}
