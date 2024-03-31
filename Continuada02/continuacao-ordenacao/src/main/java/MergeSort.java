public class MergeSort {
    public static void intercala(int indInico, int indMeio, int indFinal, int[] v) {
        int i, j, k;
        int[] w = new int[indFinal - indInico];
        i = indInico;
        j = indMeio;
        k = 0;

        while (i < indMeio && j < indFinal) {
            if (v[i] <= v[j]) {
                w[k++] = v[i++];
            } else {
                w[k++] = v[j++];
            }
        }

        while (i < indMeio) {
            w[k++] = v[i++];
        }

        while (j < indFinal) {
            w[k++] = v[j++];
        }

        for (i = indInico; i < indFinal; i++) {
            v[i] = w[i - indInico];
        }
    }

    public static void mergeSort(int indInicio, int indFinal, int[] v) {
        if (indInicio < indFinal - 1) {
            int indMeio = (indInicio + indFinal ) / 2;
            mergeSort(indInicio, indMeio, v);
            mergeSort(indMeio, indFinal, v);
            intercala(indInicio, indMeio, indFinal, v);
        }
    }

    public static void main(String[] args) {
        int[] v = {1, 9, 8,4, 7,2, 6, 3, 5};
        mergeSort(0, v.length, v);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

}
