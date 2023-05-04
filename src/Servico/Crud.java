package Servico;

import Entidades.Computador;
import Entidades.Produto;

import java.util.List;

public interface Crud {
    public boolean salvarProduto(Produto produto);
    public List<Produto> listarProduto();
    public boolean deletarProduto(long id);
    public boolean alterarProduto(Produto produto);

}
