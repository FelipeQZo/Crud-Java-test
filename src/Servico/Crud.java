package Servico;

import Entidades.Pessoa;

import java.util.List;

public interface Crud {
    public boolean salvarPessoa(Pessoa pessoa);
    public List<Pessoa> listarPessoa();
    public boolean deletarPessoa(long id);
    public boolean alterarPessoa(Pessoa pessoa);
}
