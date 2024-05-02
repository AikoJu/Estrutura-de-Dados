public class Ex04 {
    public static void main(String[] args) {
        String frase = "A pilha do gato";
        PilhaObj pilhaObj = new PilhaObj<>(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            pilhaObj.push(frase.charAt(i));
        }

        pilhaObj.exibe();
    }
}
