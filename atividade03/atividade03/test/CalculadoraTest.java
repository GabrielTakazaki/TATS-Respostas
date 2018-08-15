import tdd01.Proposta;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd01.Calculadora;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    @Test
    public void testLimite1000() {
        Calculadora c = new Calculadora ();
        List<Proposta> propostas = c.calcular(800.00f);
        assertEquals(2, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        
        assertEquals (1600f, p1.getTotal(), 0.01);
        assertEquals (2, p1.getNumeroParcelas());
        assertEquals (800f, p1.getValorParcela(), 0.01);
               
        assertEquals (1600f, p2.getTotal(), 0.01);
        assertEquals (3, p2.getNumeroParcelas());
        assertEquals (533.33f, p2.getValorParcela(), 0.01);
        
    }
}
