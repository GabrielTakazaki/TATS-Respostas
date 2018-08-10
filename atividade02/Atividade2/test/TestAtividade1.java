import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class TestAtividade1 {
    UsuarioDAO usuDAO = mock(UsuarioDAO.class);
    SenhaValidator senVAL = mock(SenhaValidator.class);
    
    UsuarioValidator usuVal = new UsuarioValidator(usuDAO);
    
    public TestAtividade1() {
        
    }
    
    @Test
    public void TestUsuarioValido() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        usuVal.setSenhaValidator(senVAL);
        
        when(senVAL.verificar("12345")).thenReturn(false);
        assertTrue(usuVal.ehUsuarioValido(u));
    }
    
    @Test(expected = Exception.class)
    public void TestNomeInvalido() throws Exception {
        Usuario u = new Usuario();
        u.setNome("ga");
        when(usuVal.ehUsuarioValido(u)).thenThrow(Exception.class);
    }
    
    @Test(expected = Exception.class)
    public void TestSenhaInvalido() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("1234");
        when(usuVal.ehUsuarioValido(u)).thenThrow(Exception.class);        
    }
    
    @Test(expected = Exception.class)
    public void TestSenhaValidatorInvalido() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        usuVal.setSenhaValidator(senVAL);
        
        when(senVAL.verificar("12345")).thenReturn(true);
        usuVal.ehUsuarioValido(u);
    }
    
    @Test
    public void TestDigitoNome() throws Exception {
        Usuario u = new Usuario();
        u.setNome("G4br1el");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        
        usuVal.setSenhaValidator(senVAL);
        
        when(senVAL.verificar("12345")).thenReturn(false);
        assertTrue(usuVal.ehUsuarioValido(u));
    }
    
    @Test
    public void TestNomeEspecial() throws Exception {
        Usuario u = new Usuario();
        u.setNome("!!!el");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        
        usuVal.setSenhaValidator(senVAL);
        
        when(senVAL.verificar("12345")).thenReturn(false);
        assertFalse(usuVal.ehUsuarioValido(u));
    }
}
