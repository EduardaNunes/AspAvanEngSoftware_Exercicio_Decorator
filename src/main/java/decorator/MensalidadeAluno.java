package decorator;

public class MensalidadeAluno implements Mensalidade{

    public float valor;

    public MensalidadeAluno(){
    }

    public MensalidadeAluno(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return this.valor;
    }

    public String getDescricao(){
        return "Mensalidade Aluno";
    }
}
