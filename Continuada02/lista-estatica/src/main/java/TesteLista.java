public class TesteLista {
    public static void main(String[] args) {
        ListaEstatica lista01 = new ListaEstatica(5);

        lista01.adiciona(1);
        lista01.adiciona(2);
        lista01.adiciona(3);
        lista01.adiciona(4);
        lista01.adiciona(5);

        int elemento = lista01.busca(2);
        System.out.println(elemento);

        System.out.println(lista01.removePeloIndice(1));
        lista01.exibe();

        System.out.println(lista01.removeElemento(3));
        lista01.exibe();




    }
}
