public class Teste {
    public static void main(String[] args) {

        int[] array = {7,3,5,2};
        int[] array2 = {7,3,3,2};

    //1.
        System.out.println(Recursao.soma(5));

    //2.
        System.out.println(Recursao.somarArray(array));

    //3.
        System.out.println(Recursao.somarVetor(array));

    //4.
        System.out.println(Recursao.somarImpares(array));

    //5.
        System.out.println(Recursao.ocorrencias(array2,3));

    //6.
        System.out.println(Recursao.mdcIterativo(90, 54));
        System.out.println(Recursao.mdcRecursivo(90, 54));

    //7.
        Recursao.MaiorElementoRecursivo(array2);

    //8.
        System.out.println(Recursao.somaDigitosRecursivo(132));

    //9.
        System.out.println(Recursao.representacaoBinariaRecursiva(4));


    }
}
