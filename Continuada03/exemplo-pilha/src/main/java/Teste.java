public class Teste {
    public static void main(String[] args) {
        Pilha pilha01 = new Pilha(5);

        PilhaObj pilhaObj = new PilhaObj(5);

        pilhaObj.push("Batata");

        pilha01.push(1);
        pilha01.push(2);
        pilha01.push(3);
        pilha01.push(4);
        pilha01.push(5);

        pilha01.peek();


    }
}
