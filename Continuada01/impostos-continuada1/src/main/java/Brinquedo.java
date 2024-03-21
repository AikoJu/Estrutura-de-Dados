public abstract class Brinquedo implements IImposto {
    private Integer codigo;
    private String nome;

    public Brinquedo(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public abstract Double getRenda();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return """
                Brinquedo:
                Código: %d
                Nome: %s""".formatted(codigo,nome);
    }
}
