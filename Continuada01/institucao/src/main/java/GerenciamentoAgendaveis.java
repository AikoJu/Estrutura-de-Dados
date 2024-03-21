import java.util.ArrayList;
import java.util.List;

public class GerenciamentoAgendaveis{
    private List<Agendavel> salasEBibloteca;

    public GerenciamentoAgendaveis() {
        this.salasEBibloteca = new ArrayList<>() ;
    }

    public void adicionarAgendavel(Agendavel agendavel){
        salasEBibloteca.add(agendavel);
    }

    public void exibirAgendaveis(){
        for (Agendavel a : salasEBibloteca){
            System.out.println(a);
        }
    }
}
