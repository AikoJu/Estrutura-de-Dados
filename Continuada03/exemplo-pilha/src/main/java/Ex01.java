public class Ex01 {
    public static Boolean isPalindromo(int[] vetor) {
        Pilha pilha1 = new Pilha(vetor.length);

        for (int i = 0 ;i < vetor.length; i++) {
            pilha1.push(vetor[i]);
        }
        for (int i = 0; i< vetor.length; i++){
            if (vetor[i] != pilha1.pop()){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] vetor = {1,3,3,1};
        int[] vetor1 = {10,20,30,40};

        System.out.println(isPalindromo(vetor));
        System.out.println(isPalindromo(vetor1));

    }
}
