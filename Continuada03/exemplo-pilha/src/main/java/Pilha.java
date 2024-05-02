public class Pilha {
    private int topo;
    private int[] pilha;

    public Pilha(int tam) {
        this.topo = -1;
        this.pilha = new int[tam];
    }

    public Boolean isEmpty(){
        return topo == -1;

    }

    public Boolean isFull(){
        return topo == pilha.length -1;
    }

    public void push(int info){
        if (isFull()){
            System.out.println("Pilha Cheia!");
        }else {
            pilha[++topo] = info;
        }
    }

    public int pop(){
        if (isEmpty()){
            return  -1;
        }
        int retorno = pilha[topo];
        topo --;
        return retorno;
        //return pilha[--topo];
    }

    public int peek(){
        if (isEmpty()){
            return -1;
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
