import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.infnet.TP.Aluno;

public class AlunoTest {

    @Test
    public void testGetStatusAprovado() {
        Aluno aluno = new Aluno("João", 16, "Matemática", 8.5);
        assertEquals("Aprovado", aluno.getStatus());
    }

    @Test
    public void testGetStatusRecuperacao() {
        Aluno aluno = new Aluno("Maria", 17, "História", 5.0);
        assertEquals("Recuperação", aluno.getStatus());
    }

    @Test
    public void testGetStatusReprovado() {
        Aluno aluno = new Aluno("Pedro", 15, "Português", 3.5);
        assertEquals("Reprovado", aluno.getStatus());
    }

    @Test
    public void testSetNome() {
        Aluno aluno = new Aluno("Carlos", 18, "Física", 7.2);
        aluno.setNome("Carlos Silva");
        assertEquals("Carlos Silva", aluno.getNome());
    }
    @Test
    public void testSetMediaNotas() {
        Aluno aluno = new Aluno("Fernanda", 17, "Química", 6.8);
        aluno.setMediaNotas(7.5);
        assertEquals(7.5, aluno.getMediaNotas(), 0.01);
    }
}
