import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];
        Integer total = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o [" + i + "]:");
            Integer num = in.nextInt();
            numeros[i] = num;
            total += num;

        }

        Double media =  total/10.0;
        System.out.println("A média de todos os números é: " + media);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media){
                System.out.println(numeros[i]);
            }
        }
        }

}
