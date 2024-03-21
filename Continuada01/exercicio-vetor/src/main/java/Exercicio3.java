import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[10];

        System.out.println("Preencha 10 nomes do vetor:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Preencha o nome ["+ i +"]:");
            nomes[i] = in.nextLine();
        }

        System.out.println("Digite o nome que queira procurar:");
        String nome = in.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            if (nomes[i].equals(nome)){
                System.out.println("Nome encontrado no índice %d".formatted());
            }
        }
        "Nome encontrado no índice x” “Nome não encontrado”.
    }
}
