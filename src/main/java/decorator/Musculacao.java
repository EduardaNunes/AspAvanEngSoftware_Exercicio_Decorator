package decorator;

public class Musculacao extends MensalidadeDecorator{

    public Musculacao(Mensalidade mensalidade) {
        super(mensalidade);
    }

    public float getValorAdicional() {
        return 100.0f;
    }

    public String getNomeServico() {
        return "Musculação";
    }

}
