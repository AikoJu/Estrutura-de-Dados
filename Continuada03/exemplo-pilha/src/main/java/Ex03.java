public class Ex03 {
    public static void main(String[] args) {
        PilhaObj pilhaObj = new PilhaObj<>(5);

        pilhaObj.push("Bola");
        pilhaObj.push("Baixo");
        pilhaObj.push("Bacon");

        pilhaObj.exibe();
    }
}
