package decorator;

public class AulaMuayThai extends MensalidadeDecorator{

    public AulaMuayThai(Mensalidade mensalidade) {
        super(mensalidade);
    }

    public float getValorAdicional() {
        return 120.0f;
    }

    public String getNomeServico() {
        return "Aula de Muay Thai";
    }

}
