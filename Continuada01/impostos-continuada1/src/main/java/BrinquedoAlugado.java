public class BrinquedoAlugado extends Brinquedo {
        private Double valorHora;
        private Integer qtdHoraAlugada;

    public BrinquedoAlugado(Integer codigo, String nome, Double valorHora, Integer qtdHoraAlugada) {
        super(codigo, nome);
        this.valorHora = valorHora;
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
        public Double getRenda() {
            return valorHora * qtdHoraAlugada;
        }
        @Override
        public Double getValorImposto() {
            return getRenda() * 0.13;
        }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQtdHoraAlugada() {
        return qtdHoraAlugada;
    }

    public void setQtdHoraAlugada(Integer qtdHoraAlugada) {
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
        public String toString() {
            return """
                %s
                Valor da hora: %.2f
                Quantidade de horas: %d""".formatted(super.toString(),valorHora,qtdHoraAlugada);
        }
}
