import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class SchoolServiceTest {

    private School school;
    private SchoolService schoolService;


    @Before
    public final void setUp() throws Exception{

        System.out.println("setUp method called");

        //Instantiates a School instance;
        school = new School();
        school.setName("testSchool");
        school.setAddress("Seoul-111");
        school.setContactNumber("0001111");
        school.setWebsite("www.naver.com");
        school.setStartedDate(LocalDateTime.now());
        school.setModifiedDate(LocalDateTime.now());
    }

    @Test
    public final void testAddSchool() throws Exception {
        School newSchool = schoolService.addSchool(school);
    }

    @Test
    public final void testUpdateSchool(){
        School newSchool = schoolService.addSchool(school);
        assertNotNull(newSchool);
        newSchool.setContactNumber("01013132424");
        schoolService.updateSchool(newSchool);
    }

    @Test
    public final void testFindSchool() {
        School newSchool = schoolService.addSchool(school);
        assertNotNull(newSchool);
        School findSchool = schoolService.findSchool(newSchool.getName());
        assertNotNull("School Type object should not null ", findSchool);
    }






}