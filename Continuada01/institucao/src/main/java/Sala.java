public abstract class Sala  implements Agendavel{
    private String nome;
    private Integer capacidade;
    private String responsavel;

    public Sala(String nome, Integer capacidade, String responsavel) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return """
                Sala
                nome: %s
                Capacidade: %d
                Responsável: %s""".formatted(nome,capacidade,responsavel);
    }
}
