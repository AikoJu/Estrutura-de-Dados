public class Socio implements IImposto {
    private String nome;
    private Double honorario;

    public Socio(String nome, Double honorario) {
        this.nome = nome;
        this.honorario = honorario;
    }

    @Override
    public Double getValorImposto() {
        return honorario * 0.24;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getHonorario() {
        return honorario;
    }

    public void setHonorario(Double honorario) {
        this.honorario = honorario;
    }

    @Override
    public String toString() {
        return
                "Socio{" +
                "nome='" + nome + '\'' +
                ", honorario=" + honorario +
                '}';
    }
}
