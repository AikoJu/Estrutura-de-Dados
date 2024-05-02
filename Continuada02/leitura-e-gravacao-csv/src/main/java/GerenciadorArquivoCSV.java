import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GerenciadorArquivoCSV {
    public static void gravaArquivoCsv(ListaObj<Pet> lista, String nomeArq) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

// Bloco try-catch para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

// Bloco try-catch para gravar o arquivo
        try {

            for (int i = 0; i < lista.getTamanho(); i++) {

//Recupere um elemento da lista e formate aqui:
                Pet pet = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f\n",
                        pet.getId(),
                        pet.getNome(),
                        pet.getPorte(),
                        pet.getPeso());
            }
        } catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

// Bloco try-catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
            System.exit(1);
        }

// Bloco try-catch para ler o arquivo
        try {
//Leia e formate a saída no console aqui:

// Cabeçalho
            System.out.printf("%-4S %-15S %-7S %-5S\n","id","nome","porte","peso");
            while (entrada.hasNext()) {
//Corpo
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();

                System.out.printf("%04d %-15s %-7S %5.1f\n",id,nome,porte,peso);
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
}
