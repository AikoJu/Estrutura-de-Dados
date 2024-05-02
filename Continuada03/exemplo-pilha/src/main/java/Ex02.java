public class Ex02 {

    public static void binario(int num){
        Pilha pilha = new Pilha((int) (Math.log(num) / Math.log(2)) + 1);

        do{
            pilha.push(num%2);
            num /= 2;
        }while ((num > 0));
        pilha.exibe();
    }

    public static void main(String[] args) {
        binario(9);
        binario(12);
    }
}
