package decorator;

public class Personal extends MensalidadeDecorator{

    public Personal(Mensalidade mensalidade) {
        super(mensalidade);
    }

    public float getPercentualValor() {
        return 30.0f;
    }

    public String getNomeServico() {
        return "Personal";
    }

}
