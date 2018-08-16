import tdd01.MostrarPropostasPM;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd01.SimularPropostasPM;

public class SimularPropostaTest {
    
    public SimularPropostaTest() {
    }
    
    @Test
    public void testeTodosCamposVazios() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome ("");
        pm.setSalario(0.0f);
        pm.setIdade(0);
        pm.setValor(0.0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals ("nome vazio\nsalario vazio\nidade vazio\nvalor vazio\n", pm.getMsgDeErro());
    }
    @Test
    public void testeSoIdadeVazio() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome ("Joao");
        pm.setSalario(1000.0f);
        pm.setIdade(0);
        pm.setValor(800.0f);
        assertNull (pm.pressionarBotaoElaborar());
        assertEquals ("idade vazio\n", pm.getMsgDeErro());
    }
    @Test
    public void testeDadosCorretos() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome ("Joao");
        pm.setSalario(800.0f);
        pm.setIdade(25);
        pm.setValor(1000.0f);
        pm.pressionarBotaoElaborar();
        MostrarPropostasPM mostrarPm = pm.pressionarBotaoElaborar();
        assertEquals ("", pm.getMsgDeErro());
        assertEquals (2, mostrarPm.getProposta().size());
    }
    @Test
    public void testeIdadeInvalida() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome ("Joao");
        pm.setSalario(1000.0f);
        pm.setIdade(15);
        pm.setValor(800.0f);
        assertNull (pm.pressionarBotaoElaborar());
        assertEquals ("idade invalida\n", pm.getMsgDeErro());
    }
}
