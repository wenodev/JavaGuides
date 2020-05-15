import java.time.LocalDateTime;

public class SchoolService {


    public School addSchool(School school) {

        School tempSchool = new School();
        tempSchool.setName("Hulk");
        tempSchool.setAddress("Seoul");
        tempSchool.setWebsite("www.naver.com");
        tempSchool.setContactNumber("01022223333");
        tempSchool.setStartedDate(LocalDateTime.now());
        tempSchool.setModifiedDate(LocalDateTime.now());

        return tempSchool;
    }

    public School updateSchool(School newSchool) {
        return newSchool;
    }

    public School findSchool(String name){
        return null;
    }

}
