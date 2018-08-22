import atividade04.CalculadoraSalarios;
import atividade04.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

public class tdd04Test {
    
    Funcionario f = new Funcionario ();
    CalculadoraSalarios calc = new CalculadoraSalarios();
    
    public tdd04Test() {
    }
    @Test
    public void funcionarioVazioTest () {
        f.setNome("");
        f.setEmail("");
        f.setCargo("");
        f.setSalariobase(0f);
        calc.calculoSalario(f);
        assertEquals("Nome vazio\nEmail vazio\n"
                + "Salario base vazio\nCargo inexistente\n", f.getMsgErro());
    }
    @Test
    public void  testeCargoInexistente() {
        
        f.setNome("G");
        f.setEmail("G");
        f.setCargo("A");
        f.setSalariobase(2000f);
        calc.calculoSalario(f);
        assertEquals("Cargo inexistente\n", f.getMsgErro());
    }
    @Test
    public void  testeEmailVazio() {
        
        f.setNome("G");
        f.setCargo("DESENVOLVEDOR");
        f.setSalariobase(2000f);
        calc.calculoSalario(f);
        assertEquals("Email vazio\n", f.getMsgErro());
    }
    
}
