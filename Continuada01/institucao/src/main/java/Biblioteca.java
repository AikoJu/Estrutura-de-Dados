import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Agendavel {
    private String nome;
    private List<String> agendamentos;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.agendamentos = new ArrayList<>();
    }

    @Override
    public boolean verificarDisponibilidade(String agendamento) {
        for (String a : agendamentos) {
            if (a.equals(agendamento)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void agendar(String data, String horario) {
        String agendamento = "Agendamento: " + data + " às " + horario;
        if (agendamentos.isEmpty()) {
            agendamentos.add(agendamento);
        } else {
            Boolean disponivel = verificarDisponibilidade(agendamento);
            if (disponivel) {
                agendamentos.add(agendamento);
                System.out.println("Espaço " + nome + " na biblioteca para " + data + " às " + horario + "reservado!");
            } else {
                System.out.println("Espaço " + nome + " na biblioteca para " + data + " às " + horario + "já está reservado :(");
            }
        }
    }

    @Override
    public void cancelarAgendamento(String data, String horario) {
        String agendamento = "Agendamento: " + data + " às " + horario;
        Boolean disponivel = verificarDisponibilidade(agendamento);
        if (disponivel) {
            System.out.println("Agendamento não encontrado!");
        } else {
            agendamentos.remove(agendamento);
            System.out.println("Agendamento na biblioteca para " + data + " às " + horario + "cancelado");
        }
    }

    @Override
    public List<String> obterAgendamentos() {
        return agendamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<String> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome;
    }
}