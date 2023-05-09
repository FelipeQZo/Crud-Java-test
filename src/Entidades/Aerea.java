package Entidades;

import java.time.LocalDate;

public class Aerea extends Entrega {
    public Aerea(String nome, LocalDate dataAtual, boolean isCanceled) {
        super( nome, dataAtual, isCanceled);
    }
}
