package sptech;

public class ListaEstatica {
    private int[] vetor;

    private int nroElem;

    public ListaEstatica(int tam) {
        vetor = new int[tam];
        nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
           throw new IllegalStateException();
        } else {
            vetor[nroElem++] = elemento;
        }
    }

    public int busca(int elementoProcurado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("\nÍndice inválido!");
            return false;
        }
        // Loop para "deslocar para a esquerda" os elementos do vetor
        // sobrescrevendo o elemento removido
        for (int i = indice; i < nroElem-1; i++) {
            vetor[i] = vetor[i+1];
        }
        nroElem--; // decrementa nroElem
        return true;
    }


    public boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento));
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia.");
        } else {
            System.out.println("\nElementos da lista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
