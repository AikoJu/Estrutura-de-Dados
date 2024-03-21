package interfaceexemplo;

public class BalcaoAtendimento implements IProcessarPedido {
    String nomeAtendente;

    public BalcaoAtendimento(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    @Override
    public void processarPedido() {
        System.out.println(String.format("""
                Registrando Pedido...
                Gerando Nota Fiscal...
                """));
    }
}
