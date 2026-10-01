package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MensalidadeTest {

    @Test
    void deveRetornarValorMensalidadeAluno() {
        Mensalidade mensalidade = new MensalidadeAluno(100.0f);
        assertEquals(100.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComMusculacao() {
        Mensalidade mensalidade = new Musculacao(new MensalidadeAluno(0.0f));
        assertEquals(100.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComAulaMuayThai() {
        Mensalidade mensalidade = new AulaMuayThai(new MensalidadeAluno(0.0f));
        assertEquals(120.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComPersonal() {
        Mensalidade mensalidade = new Personal(new MensalidadeAluno(0.0f));
        assertEquals(150.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComPersonalMaisMusculacao() {
        Mensalidade mensalidade = new Personal(new Musculacao(new MensalidadeAluno(0.0f)));
        assertEquals(250.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComPersonalMaisAulaMuayThai() {
        Mensalidade mensalidade = new Personal(new AulaMuayThai(new MensalidadeAluno(0.0f)));
        assertEquals(270.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComMusculacaoMaisAulaMuayThai() {
        Mensalidade mensalidade = new Musculacao(new AulaMuayThai(new MensalidadeAluno(0.0f)));
        assertEquals(220.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarValorMensalidadeComPersonalMaisMusculacaoMaisAulaMuayThai() {
        Mensalidade mensalidade = new Personal(new Musculacao(new AulaMuayThai(new MensalidadeAluno(0.0f))));
        assertEquals(370.0f, mensalidade.getValor());
    }

    @Test
    void deveRetornarDescricaoMensalidadeAluno() {
        Mensalidade mensalidade = new MensalidadeAluno();
        assertEquals("Mensalidade Aluno", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComMusculacao() {
        Mensalidade mensalidade = new Musculacao(new MensalidadeAluno());
        assertEquals("Mensalidade Aluno/Musculação", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComAulaMuayThai() {
        Mensalidade mensalidade = new AulaMuayThai(new MensalidadeAluno());
        assertEquals("Mensalidade Aluno/Aula de Muay Thai", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComPersonal() {
        Mensalidade mensalidade = new Personal(new MensalidadeAluno());
        assertEquals("Mensalidade Aluno/Personal", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComPersonalMaisMusculacao() {
        Mensalidade mensalidade = new Personal(new Musculacao(new MensalidadeAluno()));
        assertEquals("Mensalidade Aluno/Musculação/Personal", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComMusculacaoMaisAulaMuayThai() {
        Mensalidade mensalidade = new Musculacao(new AulaMuayThai(new MensalidadeAluno()));
        assertEquals("Mensalidade Aluno/Aula de Muay Thai/Musculação", mensalidade.getDescricao());
    }

    @Test
    void deveRetornarDescricaoComPersonalMaisMusculacaoMaisAulaMuayThai() {
        Mensalidade mensalidade = new Personal(new Musculacao(new AulaMuayThai(new MensalidadeAluno())));
        assertEquals("Mensalidade Aluno/Aula de Muay Thai/Musculação/Personal", mensalidade.getDescricao());
    }

}