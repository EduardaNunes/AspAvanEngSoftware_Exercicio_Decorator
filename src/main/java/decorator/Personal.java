package decorator;

public class Personal extends MensalidadeDecorator{

    public Personal(Mensalidade mensalidade) {
        super(mensalidade);
    }

    public float getValorAdicional() {
        return 150.0f;
    }

    public String getNomeServico() {
        return "Personal";
    }

}
