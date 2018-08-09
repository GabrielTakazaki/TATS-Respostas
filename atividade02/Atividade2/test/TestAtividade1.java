import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class TestAtividade1 {
    
    public TestAtividade1() {
        
    }
    @Test
    public void Test1() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("123");
        u.setSenhaConfirmada("123");
        
        UsuarioDAO usuarioMocked = mock(UsuarioDAO.class);
        SenhaValidator senhaMocked = mock(SenhaValidator.class);
        
        UsuarioValidator usuVal = new UsuarioValidator(usuarioMocked);
        
        usuarioMocked.getByName("Gabriel");
        senhaMocked.verificar("123");  
        
        assertTrue(usuVal.ehUsuarioValido(u));
    }
}
