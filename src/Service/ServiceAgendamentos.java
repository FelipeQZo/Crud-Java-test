package Service;

import Entidades.Entrega;

import java.util.ArrayList;
import java.util.List;

public class ServiceAgendamentos implements ICrudAgendamentos {
    private List<Entrega> entregasList = new ArrayList<>();
//   TODO private HashMap<Long, Entregas> entregasHashMap = new HashMap();

    @Override
    public void criarAgendamento(Entrega entrega) {
//      TODO  entregasHashMap.put(entrega.getId(), entrega);
        entregasList.add(entrega);
        System.out.println("Entrega criada com sucesso!\n\n");
    }

    @Override
    public List<Entrega> listarAgendamento() {
        return entregasList;
    }

    @Override
    public void cancelarAgendamento(long id) {
        /* um objeto chamado finded deve receber um valor através de uma série de métodos abaixo:
        O esse metodo usa a função Stream para permitir metodos percorrerem os objetos do ArrayList */
        Entrega finded = entregasList.stream()
                /* Em seguida o metodo filter vai percorrer a lista comparando o id de cada objeto
                com o id passado como parâmetro, os objetos que satisfazem a função passam para o proximo metodo */
                .filter(entrega -> entrega.getId() == id)
                .findFirst()//Vai pegar o primeiro objeto do filtro (Que supostamente deve ser o unico)
                .orElse(null); // Caso nenhum objeto satisfaça a condição, o finded será null

//       TODO  Entregas finded = entregasHashMap.get(id);

        if (finded != null) {
            finded.cancelarEntrega();
        }
        else {
            System.out.println("Entrega não encontrada");
        }
    }

    // TODO consertar esse método STREAM
    @Override
    public void finalizarAgendamento(Entrega entrega) {
        int index = entregasList.indexOf(entrega);
        System.out.println(index);
        if (index!=-1){
            System.out.println("Entrega finalizada com sucesso!");
            entregasList.remove(entrega);
        }
    }
}
