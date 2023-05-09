package Entidades;

import java.time.LocalDate;

public class Terrestre extends Entrega {
    public Terrestre(String nome, LocalDate dataAtual, boolean isCanceled) {
        super( nome, dataAtual, isCanceled);
    }
}
