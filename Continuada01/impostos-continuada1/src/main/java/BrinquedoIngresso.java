public class BrinquedoIngresso extends Brinquedo {
    private Double valorIngresso;
    private Integer qtdIngressoVendido;

    public BrinquedoIngresso(Integer codigo, String nome, Double valorIngresso, Integer qtdIngressoVendido) {
        super(codigo, nome);
        this.valorIngresso = valorIngresso;
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    @Override
    public Double getRenda() {
        return valorIngresso * qtdIngressoVendido;
    }

    @Override
    public Double getValorImposto() {
        return getRenda() * 0.18;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Integer getQtdIngressoVendido() {
        return qtdIngressoVendido;
    }

    public void setQtdIngressoVendido(Integer qtdIngressoVendido) {
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    @Override
    public String toString() {
        return """
                %s
                Valor do ingresso: %.2f
                Quantidade de ingressos vendidos: %d""".formatted(super.toString(),valorIngresso,qtdIngressoVendido);
    }
}
