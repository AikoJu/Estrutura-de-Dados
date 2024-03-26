public class Perfume extends Produto{
    private String fragancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    @Override
    public double getValorTributo() {
        return 0.27 * getPreco();
    }

    @Override
    public String toString() {
        return "Perfume " +
                super.toString()+
                "fragancia='" + fragancia + '\'' +
                '}';
    }
}
