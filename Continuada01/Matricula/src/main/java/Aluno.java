import java.time.LocalDate;

public class Aluno {
    private int id;
    private String nome;
    private Double notaEnem;
    private LocalDate data;
    private String curso;
    private Integer desconto;

    public Aluno(int id, String nome, Double notaEnem, LocalDate data, String curso, Integer desconto) {
        this.id = id;
        this.nome = nome;
        this.notaEnem = notaEnem;
        this.data = data;
        this.curso = curso;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(Double notaEnem) {
        this.notaEnem = notaEnem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", notaEnem=" + notaEnem +
                ", data=" + data +
                ", curso='" + curso + '\'' +
                ", desconto=" + desconto +
                '}';
    }
}
