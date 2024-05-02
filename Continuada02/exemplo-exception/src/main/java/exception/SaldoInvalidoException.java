package exception;

public class SaldoInvalidoException extends Exception{
     String nomeUsuario;

    public SaldoInvalidoException(String message, String nomeUsuario) {
        super(message);
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
