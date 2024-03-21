public class TesteRecursao {

    public static Integer soma(int n){
        return n + soma(n-1);
    }

    public static void contagemRegressiva(int n){
        for (int i = n; i >= 0 ; i--) {
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva (int n){
        if(n == 0){
            System.out.println(n);
        }else{
            System.out.println(n);
            contagemRegressivaRecursiva(n - 1);
        }
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }else {
            return  n*fatorial(n-1);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
        contagemRegressivaRecursiva(5);
        System.out.println(fatorial(10000));
        System.out.println(soma(5));
    }

}
