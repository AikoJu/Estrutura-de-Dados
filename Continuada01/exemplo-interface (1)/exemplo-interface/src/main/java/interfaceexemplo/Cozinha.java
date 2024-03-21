package interfaceexemplo;

public class Cozinha implements IProcessarPedido{
    private String nomeChef;

    public Cozinha(String nomeChef) {
        this.nomeChef = nomeChef;
    }

    @Override
    public void processarPedido() {
        System.out.println(String.format("""
                Separando ingredientes...
                Montando Prato...
                Pronto para entregar...
                """));
    }
}
