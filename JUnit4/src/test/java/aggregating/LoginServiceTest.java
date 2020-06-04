package aggregating;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void authenticateSuccessTest(){
        LoginService login = new LoginService();
        assertTrue(login.authenticate("demo", "demo"));
    }

    @Test
    public void authenticateFailTest(){
        LoginService login = new LoginService();
        assertFalse(login.authenticate("deno1", "demo1"));
    }


}