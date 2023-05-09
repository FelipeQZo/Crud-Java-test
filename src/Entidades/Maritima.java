package Entidades;

import java.time.LocalDate;

public class Maritima extends Entrega {
    public Maritima(String nome, LocalDate dataAtual, boolean isCanceled) {
        super( nome, dataAtual, isCanceled);
    }
}
