import java.util.ArrayList;
import java.util.List;

public class Tecnica extends Sala{
    private String tipoEquipamento;
    private List<String> agendamentos;

    public Tecnica(String nome, Integer capacidade, String responsavel, String tipoEquipamento) {
        super(nome, capacidade, responsavel);
        this.tipoEquipamento = tipoEquipamento;
        this.agendamentos = new ArrayList<>();
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
        if (agendamentos.isEmpty()){
            agendamentos.add(agendamento);
            System.out.println("Agendamento em Sala Técnica " + getNome() + " com " + tipoEquipamento + " para " +  data + " às " + horario + "reservado!");
        }else {
            Boolean disponivel = verificarDisponibilidade(agendamento);
            if (disponivel) {
                agendamentos.add(agendamento);
                System.out.println("Agendamento em Sala Técnica " + getNome() + " com " + tipoEquipamento + " para "+  data + " às " + horario + " reservado!");
            } else {
                System.out.println("Agendamento em Sala Técnica " + getNome() + " com " + tipoEquipamento + " para " + data + " às " + horario + " já está reservado :(");
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
            System.out.println("Agendamento para " + data + " às " + horario + "cancelado." );
        }
    }

    @Override
    public List<String> obterAgendamentos() {return agendamentos;}

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    @Override
    public String toString() {
        return """
                %s
                Tipo de equipamento: %s""".formatted(super.toString(),tipoEquipamento);
    }
}
