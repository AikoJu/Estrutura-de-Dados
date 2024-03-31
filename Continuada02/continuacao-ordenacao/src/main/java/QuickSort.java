import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] v, int indInicio, int indFim){
        int i,j, pivo;
        i = indInicio;
        j = indFim;
        pivo = v[(indInicio + indFim) /2];

        while (i <= j){
            while (i< indFim && v[i] < pivo){
                i = i + 1;
            }
            while (j > indInicio && v[j] > pivo){
                j = j-1;
            }
            if(i<=j){
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i= i + 1;
                j = j-1 ;
            }
        }
        if(indInicio < j){
            quickSort(v,indInicio,j);
        }
        if (i < indFim){
            quickSort(v,i,indFim);
        }
    }



    public static void main(String[] args) {
        int [] v = {5,8,9,4,2,3,1};
        quickSort(v,0,v.length -1);
        System.out.println(Arrays.toString(v));
    }
}
