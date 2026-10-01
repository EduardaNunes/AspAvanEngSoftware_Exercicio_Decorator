package decorator;

public class Musculacao extends MensalidadeDecorator{

    public Musculacao(Mensalidade mensalidade) {
        super(mensalidade);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeServico() {
        return "Musculação";
    }

}
