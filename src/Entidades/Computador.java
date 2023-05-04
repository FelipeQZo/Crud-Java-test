package Entidades;

public class Computador extends Produto {
    private long id;
    private String nome;
    private String modelo;
    private int preco;

    public Computador(long id, String nome, String modelo, int preco) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }

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

    public String getSobrenome() {
        return modelo;
    }

    public void setSobrenome(String sobrenome) {
        this.modelo = sobrenome;
    }

    public int getIdade() {
        return preco;
    }

    public void setIdade(int idade) {
        this.preco = preco;
    }
}
