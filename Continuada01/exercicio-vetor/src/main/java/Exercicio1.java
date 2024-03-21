import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inLn = new Scanner(System.in);

        int[] numeros = new int[7];

        System.out.println("Digite 7 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o [" + i + "]:");
            numeros[i]=inLn.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length; i >= 0 ; i-- ){
            System.out.println(numeros[i]);
        }

    }
}
