
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class Atividade2Test {

    UsuarioDAO usuDAO = mock(UsuarioDAO.class);
    SenhaValidator senVAL = mock(SenhaValidator.class);
    UsuarioValidator usuVal = new UsuarioValidator(usuDAO);

    public Atividade2Test() {

    }

    @Test
    public void UsuarioValidoTest() throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        usuVal.setSenhaValidator(senVAL);

        when(senVAL.verificar("12345")).thenReturn(false);
        assertTrue(usuVal.ehUsuarioValido(u));
    }

    @Test(expected = Exception.class)
    public void NomeInvalidoTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("ga");
        when(usuVal.ehUsuarioValido(u)).thenThrow(Exception.class);
    }

    @Test(expected = Exception.class)
    public void SenhaInvalidoTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("1234");
        when(usuVal.ehUsuarioValido(u)).thenThrow(Exception.class);
    }

    @Test(expected = Exception.class)
    public void SenhaValidatorInvalidoTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        usuVal.setSenhaValidator(senVAL);

        when(senVAL.verificar("12345")).thenReturn(true);
        usuVal.ehUsuarioValido(u);
    }

    @Test
    public void DigitoNomeTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("G4br1el");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");

        usuVal.setSenhaValidator(senVAL);

        when(senVAL.verificar("12345")).thenReturn(false);
        assertTrue(usuVal.ehUsuarioValido(u));
    }

    @Test
    public void NomeEspecialTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("!!!el");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");

        usuVal.setSenhaValidator(senVAL);

        when(senVAL.verificar("12345")).thenReturn(false);
        assertFalse(usuVal.ehUsuarioValido(u));
    }

    @Test(expected = Exception.class)
    public void NomeExistenteTest() throws Exception {
        Usuario u = new Usuario();
        u.setNome("Gabriel");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");

        usuVal.setSenhaValidator(senVAL);

        when(usuDAO.getByName("Gabriel")).thenReturn(u);
        when(senVAL.verificar("12345")).thenReturn(false);
        usuVal.ehUsuarioValido(u);
    }
}
