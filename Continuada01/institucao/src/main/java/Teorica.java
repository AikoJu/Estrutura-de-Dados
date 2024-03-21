import java.util.ArrayList;
import java.util.List;

public class Teorica extends Sala{
    private Boolean possuiProjetor;
    private List<String>agendamentos;

    public Teorica(String nome, Integer capacidade, String responsavel, Boolean possuiProjetor) {
        super(nome, capacidade, responsavel);
        this.possuiProjetor = possuiProjetor;
        this.agendamentos = new ArrayList<>();
    }

    public String verificarProjetor(Boolean possuiProjetor){
        if (possuiProjetor){
            return "com";
        }
        return "sem";
    }


    @Override
    public boolean verificarDisponibilidade(String agendamento) {
        for (String a : agendamentos){
            if (a.equals(agendamento)){
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
                agendamentos.add("Agendamento: " + data + " às " + horario);
                System.out.println("Agendamento em Sala Teórica " + getNome() + " " + verificarProjetor(possuiProjetor) + " projetor, para " + data + " às " + horario + "reservado!");
            } else {
                System.out.println("Agendamento em Sala Teórica " + getNome() + " " + verificarProjetor(possuiProjetor) + " projetor, para " + data + " às " + horario + " já está reservado :(");
            }
        }
    }

    @Override
    public void cancelarAgendamento(String data, String horario) {
        String agendamento = "Agendamento: " + data + " às " + horario;
        Boolean disponivel =  verificarDisponibilidade(agendamento);
        if (disponivel){
            System.out.println("Agendamento não encontrado!");
        }else{
            agendamentos.remove(agendamento);
            System.out.println("Agendamento para " + data + " às " + horario + "cancelado" );
        }
    }

    @Override
    public List<String> obterAgendamentos() {return agendamentos;}

    public Boolean getPossuiProjetor() {
        return possuiProjetor;
    }

    public void setPossuiProjetor(Boolean possuiProjetor) {
        this.possuiProjetor = possuiProjetor;
    }

    @Override
    public String toString() {
        String p = verificarProjetor(possuiProjetor);
        return """
                %s
                Projetor: %s""".formatted(super.toString(),p);
    }
}
