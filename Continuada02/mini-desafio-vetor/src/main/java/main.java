import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] turma1 = new String[10];
        String[] turma2 = new String[10];
        int qtdT1 = 0;
        int qtdT2 = 0;

        for (int i = 0; i< turma2.length; i++){
            System.out.println("Digite o nome: ");
            String nomeDigitado = sc.nextLine();

            System.out.println("Agora digite a turma (T1 OU T2): ");
            String turmaDigitada = sc.nextLine();
            Boolean turmaValida = turmaDigitada.equalsIgnoreCase("t1") && turmaDigitada.equalsIgnoreCase("t2");


            while (!turmaValida){
                System.out.println("Turma inválida");
                turmaDigitada = sc.nextLine();
                turmaValida = turmaDigitada.equalsIgnoreCase("t1") && turmaDigitada.equalsIgnoreCase("t2");
            }
            if (turmaDigitada.equalsIgnoreCase("T1")){
                turma1[qtdT1] = nomeDigitado;
                qtdT1 ++;
            }

            else {
                turma2[qtdT2] = nomeDigitado;
                    qtdT2 ++;
            }
        }

        System.out.println("Exibindo vetor: ");
        System.out.println(Arrays.toString(turma1));
        System.out.println(Arrays.toString(turma2));

    }
}
