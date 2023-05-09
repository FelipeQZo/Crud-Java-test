package Entidades;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Entrega {
    // fields
    static long idGlobal;
    long id;
    String nome;
    LocalDate dataAtual;
    LocalDate previsaoDeEntrega;
    boolean isCanceled;

    public Entrega(String nome, LocalDate dataAtual, boolean isCanceled) {
        this.id = ++idGlobal;
        this.nome = nome;
        this.dataAtual = dataAtual;
        this.isCanceled = isCanceled;
        previsaoDeEntrega = dataAtual.plusDays(7);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrega entregas = (Entrega) o;
        return id == entregas.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void cancelarEntrega(){
        this.isCanceled = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

    public LocalDate getPrevisaoDeEntrega() {
        return previsaoDeEntrega;
    }

    public void setPrevisaoDeEntrega(LocalDate previsaoDeEntrega) {
        this.previsaoDeEntrega = previsaoDeEntrega;
    }

    public boolean getisCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

}
