package Service;

import Entidades.Entrega;

import java.util.List;

public interface ICrudAgendamentos {
   void criarAgendamento(Entrega entrega);
   void cancelarAgendamento(long id);
   void finalizarAgendamento(Entrega entrega);
   public List<Entrega> listarAgendamento();

}
