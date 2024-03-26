public class Recursao {

    //1.
    public static Integer soma(int num) {
        if (num == 0) {
            return 0;
        }
        return num + soma(num - 1);
    }

    //2.
    public static int somarArray(int[] array) {
        return SomarArrayAjudante(array, array.length - 1);
    }

    private static int SomarArrayAjudante(int[] v, int index) {
        if (index < 0)
            return 0;

        return v[index] + SomarArrayAjudante(v, index - 1);
    }

    //3.
    public static int somarVetor(int[] array) {
        return SomarVetorPares(array, array.length - 1);
    }

    public static int SomarVetorPares(int[] v, int index) {
        if (index < 0)
            return 0;
        else if (v[index] % 2 == 0)
            return v[index] + SomarVetorPares(v, index - 1);
        else {
            return SomarVetorPares(v, index - 1);
        }
    }

    //4.

    public static int somarImpares(int[] array) {
        return quantidadeImparesRecursivo(array, array.length - 1);
    }

    private static int quantidadeImparesRecursivo(int[] vetor, int indice) {
        if (indice < 0) {
            return 0;
        }
        int elementoAtual = vetor[indice];
        if (elementoAtual % 2 != 0) {
            return 1 + quantidadeImparesRecursivo(vetor, indice - 1);
        }
        return quantidadeImparesRecursivo(vetor, indice - 1);
    }


    //5.
    public static int ocorrencias(int[] vetor, int x) {
        return contarOcorrencias(vetor, x, vetor.length - 1);
    }

    private static int contarOcorrencias(int[] vetor, int x, int indice) {
        if (indice < 0) {
            return 0;
        }
        if (vetor[indice] == x) {
            return 1 + contarOcorrencias(vetor, x, indice - 1);
        }
        return contarOcorrencias(vetor, x, indice - 1);
    }

    //6.
    // Versão iterativa
    public static int mdcIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Versão recursiva
    public static int mdcRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdcRecursivo(b, a % b);
        }
    }

    //7.
    public static void MaiorElementoRecursivo(int[] vetor) {
        int maior = maiorElementoRecursivo(vetor, vetor.length - 1);
        System.out.println("O maior elemento do vetor é: " + maior);
    }

    public static int maiorElementoRecursivo(int[] vetor, int indice) {
        if (indice == 0) {
            return vetor[0];
        }
        return Math.max(vetor[indice], maiorElementoRecursivo(vetor, indice - 1));
    }

    //8.
    public static int somaDigitosRecursivo(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 + somaDigitosRecursivo(numero / 10);
        }
    }

    //9.
    public static String representacaoBinariaRecursiva(int numero) {
        if (numero == 0) {
            return "";
        } else {
            return representacaoBinariaRecursiva(numero / 2) + numero % 2;
        }
    }
}

