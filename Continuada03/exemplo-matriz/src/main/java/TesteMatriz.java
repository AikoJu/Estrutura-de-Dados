import java.util.Scanner;


public class TesteMatriz {
    public static void exibir(int[][] matriz){
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.printf(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void exibirTrans(int[][] matriz){
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz[0].length; linha++) {
                System.out.printf(matriz[coluna][linha] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor= new int[4];
        int[][] matriz = new int[3][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("matriz[" + linha+"] ["+ coluna+"] \npreencha ");
                matriz[linha][coluna]= sc.nextInt();
                System.out.println("\n");
            }
        }

     exibir(matriz);
        exibirTrans(matriz);
    }

}




//te amo muitooooooooooooooooooooooooooooooooo