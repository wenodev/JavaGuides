import dao.InstructorDao;
import entity.Instructor;
import entity.InstructorDetail;

public class MainApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("huwon", "son","abc@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("www.sss.com", "soccer");
        instructor.setInstructorDetail(instructorDetail);

        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);

        System.out.println("instructorDetail : " + instructor.getInstructorDetail().getYoutubeChannel());

    }
}
