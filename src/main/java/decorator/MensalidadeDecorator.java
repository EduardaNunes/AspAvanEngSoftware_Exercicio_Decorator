package decorator;

public abstract class MensalidadeDecorator implements Mensalidade{

    private Mensalidade mensalidade;
    public String descricao;

    public MensalidadeDecorator(Mensalidade mensalidade){
        this.mensalidade = mensalidade;
    }

    public Mensalidade getMensalidade(){
        return this.mensalidade;
    }

    public abstract float getPercentualValor();

    public float getValor(){
        return this.mensalidade.getValor();
    }

    public abstract String getNomeServico();

    public String getDescricao(){
        return this.mensalidade.getDescricao() + '/' + this.getNomeServico();
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
