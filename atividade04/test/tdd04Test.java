import atividade04.CalculadoraSalarios;
import atividade04.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

public class tdd04Test {
    
    public tdd04Test() {
    }
    @Test
    public void funcionarioVazioTest () {
        Funcionario f = new Funcionario ();
        f.setNome("");
        f.setEmail("");
        f.setCargo("");
        f.setSalariobase(0f);
        assertEquals("nome vazio\nemail vazio\n"
                + "cargo vazio\nsalario base vazio\n", f.getMsg());
    }
    @Test
    public void  testeCargoInexistente() {
        Funcionario f = new Funcionario ();
        f.setNome("G");
        f.setEmail("G");
        f.setCargo("A");
        f.setSalariobase(2000f);
        CalculadoraSalarios calc = new CalculadoraSalarios();
        calc.calculoSalario(f);
        assertEquals("Cargo inexistente", f.getMsgCargo());
    }
    
    
}
