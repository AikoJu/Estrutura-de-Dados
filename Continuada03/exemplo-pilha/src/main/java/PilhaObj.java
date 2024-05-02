public class PilhaObj<T> {
    private int topo;
    private T[] pilha;

    public PilhaObj(int tam) {
        this.topo = -1;
        this.pilha = (T[]) new Object[tam];
    }

    public Boolean isEmpty(){
        return topo == -1;

    }

    public Boolean isFull(){
        return topo == pilha.length -1;
    }

    public void push(T info){
        if (isFull()){
            System.out.println("Pilha Cheia!");
        }else {
            pilha[++topo] = info;
        }
    }

    public T pop(){
        if (isEmpty()){
            return  null;
        }
        return pilha[topo--];
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        return pilha[topo];
    }

    public void exibe(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
        }else {
            for (int i = topo; i >= 0 ; i--){
                System.out.println(pilha[i]);
            }
        }
    }





}
