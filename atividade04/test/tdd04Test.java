import atividade04.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

public class tdd04Test {
    
    public tdd04Test() {
    }
    @Test
    public void funcionarioVazio () {
        Funcionario f = new Funcionario ();
        f.setNome("");
        f.setEmail("");
        f.setCargo("");
        f.setSalariobase(0f);
        assertEquals("nome vazio\nemail vazio\n"
                + "cargo vazio\nsalario base vazio\n", f.getMsg);
    }
    
}
