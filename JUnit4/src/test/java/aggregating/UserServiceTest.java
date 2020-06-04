package aggregating;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {

    private User user;
    private UserService userService = new UserService();

    @Before
    public void setup(){
        user = new User(100, "Juwon");
    }

    @Test
    public void userServiceTest(){

        userService.createUser(user);
        List<User> users = userService.getUsers();
        assertEquals(1, users.size());
        userService.deleteUser(user);
        assertEquals(0,users.size());
    }






}