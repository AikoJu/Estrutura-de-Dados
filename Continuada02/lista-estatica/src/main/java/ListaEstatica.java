import java.util.Arrays;

public class ListaEstatica {
    int[] vetor;
    int nroElem;

    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }

    public void adiciona (int valor){
        if (vetor.length == nroElem)
            System.out.println("Lista cheia");
        else
        vetor[nroElem] = valor;
        nroElem ++;
    }

    public void exibe(){
        System.out.println(Arrays.toString(vetor));
    }

    public int busca (int valor){
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice){
        if (indice > vetor.length ){
            return false;
        }
        nroElem --;
        for (int i = indice; i <= nroElem -1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[nroElem] = 0;
            return true;
    }

    public boolean removeElemento(int nroEle){
        for (int i= 0; i < vetor.length ; i++ ){
            if (vetor[i] == nroEle){
                removePeloIndice(i);
                return true;
            }
        }
        return false;
    }

}
