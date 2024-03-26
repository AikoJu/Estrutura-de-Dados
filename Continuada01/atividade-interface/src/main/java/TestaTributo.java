public class TestaTributo {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento(1,"Feijão",15.3,10);
        Perfume perfume1 = new Perfume(2,"Perfume de mulher",150.0,"Amadeirado");
        Servico servico1 = new Servico("Corte de cabelo",120.0);
        Tributo tributo = new Tributo();

        tributo.adicionaTributavel(alimento1);
        tributo.adicionaTributavel(perfume1);
        tributo.adicionaTributavel(servico1);

        System.out.println("Itens da lista: ");
        tributo.exibeTodos();

        System.out.println("Valor total " + tributo.calculaTotalTributo());

    }
}
