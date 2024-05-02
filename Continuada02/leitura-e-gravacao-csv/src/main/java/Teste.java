public class Teste {
    public static void main(String[] args) {
        ListaObj<Pet> pets = new ListaObj<>(5);


        pets.adiciona(new Pet(100, "Hachiko", "M", 30.0));
        pets.adiciona(new Pet(101, "Mari","G",50.0));
        pets.adiciona(new Pet(102, "Yuki","P",10.0));
        pets.adiciona(new Pet(103, "Lele","P",15.0));


        System.out.println("Gravando Arquivo");
        GerenciadorArquivoCSV.gravaArquivoCsv(pets,"pets");
        GerenciadorArquivoCSV.leArquivoCsv("pets");
    }
}
