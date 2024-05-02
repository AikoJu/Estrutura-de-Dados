import banco.ContaBancaria;
import exception.SaldoInvalidoException;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Marcelo" , 100.0);


        try {
            contaBancaria01.sacar(120.0);
        }catch (SaldoInvalidoException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Usuario: " + ex.getNomeUsuario());
        }
    }
}
