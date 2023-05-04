package Servico;

import Entidades.Computador;
import Entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class ServicoCrud implements Crud{

    private List<Produto> listaPessoa = new ArrayList<Produto>();

    @Override
    public boolean salvarProduto(Produto pessoa) {
        try {
            listaPessoa.add(pessoa);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Produto> listarProduto() {
        return listaPessoa;
    }

    @Override
    public boolean deletarProduto(long id) {
        for (Produto produto : listaPessoa) {
            if (produto.getId() == id) {
                listaPessoa.remove(produto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean alterarProduto(Produto produto) {
        for ( Produto produtos : listaPessoa) {
            if (produto.getId() == produto.getId()) {
                listaPessoa.remove(produto);
                salvarProduto(produto);
            }
        }
        return false;
    }


}
