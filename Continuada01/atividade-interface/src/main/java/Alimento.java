public class Alimento extends Produto {
    private Integer quantVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    public Integer getQuantVitamina() {
        return quantVitamina;
    }

    public void setQuantVitamina(Integer quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    @Override
    public double getValorTributo() {
        return 0.15 * getPreco();
    }

    @Override
    public String toString() {
        return "Alimento " +
                super.toString()+
                "quantVitamina=" + quantVitamina +
                '}';
    }
}
