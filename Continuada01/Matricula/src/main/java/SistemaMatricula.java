import java.time.LocalDate;

public class SistemaMatricula {
    public static int pesquisaBinaria (Aluno[] alunos, String nomeProcurado) {
            int baixo = 0;
            int alto = alunos.length - 1;

            while (baixo <= alto) {
                int meio = (baixo + alto) / 2;
                String nomeMeio = alunos[meio].getNome();

                int resultadoComparacao = nomeProcurado.compareTo(nomeMeio);

                if (resultadoComparacao < 0) {
                    alto = meio - 1;
                } else if (resultadoComparacao > 0) {
                    baixo = meio + 1;
                } else {
                    return meio;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[8];

        alunos[0] = new Aluno(5, "Alice", 500.0, LocalDate.parse("2021-02-20"), "ADS", 70);
        alunos[1] = new Aluno(2, "Felipe", 600.0, LocalDate.parse("2021-03-15"), "ADM", 90);
        alunos[2] = new Aluno(1, "Carol", 550.0, LocalDate.parse("2020-09-10"), "ADM", 60);
        alunos[3] = new Aluno(4, "Dan", 580.0, LocalDate.parse("2022-01-25"), "DIR", 40);
        alunos[4] = new Aluno(8, "Eva", 620.0, LocalDate.parse("2021-07-30"), "DIR", 55);
        alunos[5] = new Aluno(3, "Gabriel", 530.0, LocalDate.parse("2023-05-14"), "BIO", 20);
        alunos[6] = new Aluno(7, "Larissa", 1000.0, LocalDate.parse("2022-08-19"), "MED", 30);
        alunos[7] = new Aluno(6, "Maicon", 610.0, LocalDate.parse("2020-11-11"), "GEO", 50);

        for (int i = 0; i < alunos.length - 1; i++) {
            for (int j = 1; j < alunos.length - i; j++) {
                if (alunos[j - 1].getId() > alunos[j].getId()) {
                    Aluno aux = alunos[j];
                    alunos[j] = alunos[j - 1];
                    alunos[j - 1] = aux;
                }
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        for (int i = 0; i < alunos.length - 1; i++) {
            for (int j = i + 1; j < alunos.length; j++) {
                if (alunos[j].getData().compareTo(alunos[i].getData()) < 0) {
                    Aluno aux = alunos[i];
                    alunos[i] = alunos[j];
                    alunos[j] = aux;
                }
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        int resultado = pesquisaBinaria(alunos,"Larissa");
        if (resultado != -1) {
            System.out.println("Encontrado na posição " + resultado);
        } else {
            System.out.println("Não encontrado.");
        }


    }
}
