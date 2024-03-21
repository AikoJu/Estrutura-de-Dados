import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int [] v = {4,7,5,2,8,1,6,3};
        int [] v2 = {4,7,5,2,8,1,6,3};
        int [] v3 = {4,7,5,2,8,1,6,3};
        int [] v4 = {4,7,5,2,8,1,6,3};

        Ordena.seletcionSort(v);
        Ordena.selectionSortOtimizado(v2);
        Ordena.bubbleSort (v3);
        int resultado = Ordena.pesquisaBinaria(v,4);
        Ordena.insertionSort(v4);

        System.out.println("""
                        Selection Sort:
                        %s
                        Selection Sort: Otimizado:
                        %s
                        Bubble Sort:
                        %s
                        Pesquisa binária:
                        %d
                        Insertion Sort:
                        %s""".formatted(Arrays.toString(v), Arrays.toString(v2), Arrays.toString(v3), resultado,Arrays.toString(v4)));

    }
}
