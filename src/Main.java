import Entidades.Aerea;
import Entidades.Entrega;
import Entidades.Maritima;
import Entidades.Terrestre;
import Service.ServiceAgendamentos;

import java.time.LocalDate;
import java.util.List;

public class Main {
    static ServiceAgendamentos crud = new ServiceAgendamentos();
    public static void main(String[] args) {
        testeDeArray();
        System.out.println("Listagem All");
        listar();
        System.out.println("Listagem com Agendamento cancelado");
        crud.cancelarAgendamento(2);
        listar();
        System.out.println("Listagem com Agendamento finalizado");
        finalizar();
        listar();

    }
    static void testeDeArray(){
        Aerea entrega1 = new Aerea("Latam", LocalDate.of(2023,5,1), false);
        crud.criarAgendamento(entrega1);
        Maritima entrega2= new Maritima("Maenski",LocalDate.of(2023, 12, 30), false);
        crud.criarAgendamento(entrega2);
        Terrestre entrega3 = new Terrestre("Braspress",LocalDate.of(2023,10,21), false);
        crud.criarAgendamento(entrega3);
        Terrestre entrega4 = new Terrestre("Exata Cargo",LocalDate.of(2023,8,13), false);
        crud.criarAgendamento(entrega4);
    }

    static void listar(){
        List<Entrega> lista = crud.listarAgendamento();
        if (lista.isEmpty()){
            System.out.println("Nenhum agendamento cadastrado");
        }
        else{
            for (Entrega entrega: lista) {
                System.out.println("\nId: "+ entrega.getId());
                System.out.println("Nome: "+ entrega.getNome());
                System.out.println("Previsão de entrega: "+ entrega.getPrevisaoDeEntrega());
                System.out.println("Entrega cancelada: "+ entrega.getisCanceled());
                System.out.println("======================================");
            }
        }
    }


    static void finalizar(){
//        Maritimo entrega2= new Maritimo("Maenski",9, false);
//        crud.finalizarAgendamento(entrega2);
    }
}