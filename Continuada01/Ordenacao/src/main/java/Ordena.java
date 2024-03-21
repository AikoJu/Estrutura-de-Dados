public class Ordena {
    public static void seletcionSort(int [] v){
        for (int i = 0 ; i < v.length -1 ; i++) {
            for (int  j = i + 1 ; j < v.length; j++) {
                if(v[j] < v[i]){
                    int aux = v[i];
                    v[i] = v[j];
                    v[j]=aux;
                }
            }
        }
    }

//    public static void selectionSortOtimizado(int[] v){
//        int indice;
//
//        for (int i = 0 ; i < v.length -1 ; i++) {
//            indice = v.length -1;
//            for (int  j = i + 1 ; j < v.length; j++) {
//                if(v[indice] < v[j]){
//                    indice = j;
//                }
//            }
//            int aux = v[i];
//            v[i] = v[indice];
//            v[indice] = aux;
//        }
//
//    }


    public static void selectionSortOtimizado(int[] v) {
        for (int x = 0; x < v.length-1; x++) {
            int indice = v.length -1;
            for (int y = x + 1; y < v.length; y++) {
                if (v[y] > v[x]) {
                    indice = x
                    ;
                }
            }
            int aux = v[x];
            v[x] = v[indice];
            v[indice] = aux;
        }
    }

    public static void bubbleSort(int [] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length - i; j++) {
                if (v[j-1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static Integer pesquisaBinaria (int[] v, int x) {
        Integer indinf, indsup, meio;
        indinf = 0;
        indsup = v.length - 1;
        while (indinf <= indsup) {
            meio = (indinf + indsup) / 2;
            if (v[meio] == x) {
                return v[meio];
            } else if (x < v[meio]) {
                indsup = meio -1;
            }else {
                indinf = meio +1;
            }
        };
        return -1;
    }

    public static void insertionSort(int[] v){
        for (int i = 1; i < v.length; i++) {
             int x = v[i];
             int j = i - 1;
             while (j >= 0 && v[j] > x) {
                v[j +1] = v[j];
                j = j - 1;
             }
             v[j+1] = x;
        }
    }
}
