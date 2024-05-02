public class Ex05 {
    public static boolean isPalindromo(String palavra) {
        PilhaObj pilha = new PilhaObj<Character>(palavra.length());

        for (int i = 0 ;i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c != ' '){
                pilha.push(c);
            }
        }

        for (int i = 0; i< palavra.length(); i++){
            char c = palavra.charAt(i);
            if (c != ' '){
                if (!(pilha.pop().equals(c))){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String palavra1 = "subi no onibus";
        String palavra2 = "Batata";

        System.out.println(isPalindromo(palavra1));
        System.out.println(isPalindromo(palavra2));
    }

}