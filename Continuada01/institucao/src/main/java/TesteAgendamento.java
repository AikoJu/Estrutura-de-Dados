

public class TesteAgendamento {
    public static void main(String[] args) {

        GerenciamentoAgendaveis gerenciamentoAgendaveis = new GerenciamentoAgendaveis();
       Biblioteca biblioteca = new Biblioteca("Sala 05");
       Tecnica tecnica01 = new Tecnica("Laboratório", 52,"Fernando","Cientifico");
       Tecnica tecnica02 = new Tecnica("Laboratório de informática", 60,"Catarina","Computador");
       Teorica teorica01 = new Teorica("Sala 05",50,"Flávia",true);

       gerenciamentoAgendaveis.adicionarAgendavel(biblioteca);
       gerenciamentoAgendaveis.adicionarAgendavel(tecnica01);
       gerenciamentoAgendaveis.adicionarAgendavel(tecnica02);
       gerenciamentoAgendaveis.adicionarAgendavel(teorica01);
       //gerenciamentoAgendaveis.exibirAgendaveis();

       tecnica01.agendar("10/02","10:00");
       tecnica01.agendar("10/02","11:00");

        System.out.println(tecnica01.obterAgendamentos());


    }
}
