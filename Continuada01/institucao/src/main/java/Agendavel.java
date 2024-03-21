import java.util.List;

public interface Agendavel {
     boolean verificarDisponibilidade(String agendamento);

    void agendar(String data, String horario);

    void cancelarAgendamento(String data, String horario);

    List<String> obterAgendamentos();
}
