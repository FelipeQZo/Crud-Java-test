package Servico;

import Entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ServicoCrud implements Crud{

    private List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    @Override
    public boolean salvarPessoa(Pessoa pessoa) {
        try {
            listaPessoa.add(pessoa);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Pessoa> listarPessoa() {
        return listaPessoa;
    }

    @Override
    public boolean deletarPessoa(long id) {
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getId() == id) {
                listaPessoa.remove(pessoa);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean alterarPessoa(Pessoa pessoa) {
        return false;
    }
}
