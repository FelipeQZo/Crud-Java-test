import Entidades.Pessoa;
import Servico.ServicoCrud;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static ServicoCrud test = new ServicoCrud();
    public static void main(String[] args) {

        testeDeArray();
        listarPessoas();
        test.deletarPessoa(2);
        System.out.println("APOS O METODO DELETE");
        listarPessoas();

    }

    static void testeDeArray(){
//        ServicoCrud test = new ServicoCrud();
        Pessoa pessoa = new Pessoa(01,"Felipe","Queiroz",20);


        test.salvarPessoa(pessoa);

        Pessoa pessoa2 = new Pessoa(02,"Jozimar","Junior",28);
        test.salvarPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa(03,"Clecia","Furtado",45);

        test.salvarPessoa(pessoa3);

        Pessoa pessoa4 = new Pessoa(04,"Marcelly","Pessoa",25);

        test.salvarPessoa(pessoa4);

    }
    static void listarPessoas() {
        List<Pessoa> lista = test.listarPessoa();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma pessoa encontrada.");
        } else {
            for (Pessoa pessoa : lista) {
                System.out.println("id: " + pessoa.getId());
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Sobrenome: " + pessoa.getSobrenome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("---------------------------");
            }
        }
    }
}
