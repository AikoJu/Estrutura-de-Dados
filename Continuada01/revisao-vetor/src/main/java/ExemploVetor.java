import java.util.Scanner;

public class ExemploVetor {
    public static void exibirVetor ( int[] vetor){
        for (int i = 0; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inln = new Scanner(System.in);

        int[] vetor02 = {10,20,30,40,50};
        System.out.println("Vetor 02");
        exibirVetor(vetor02);

        String nome = "Bob";

        System.out.println(nome);

        String[] diaSemana = {"Segunda", "Terça","Quarta","Quinta","Sexta"};


        String[] nomes;
        int tamanho;
        do {
            System.out.println("Digite o tamanho do vetor:");
            tamanho = in.nextInt();
        }while (tamanho < 2);

        nomes = new String[tamanho];
        System.out.println("Agora preencha os nomes do vetor:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Preencha o nome ["+ i +"]:");
            nomes[i] = inln.nextLine();
        }

        System.out.println("Exibindo os nomes cadastrados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
