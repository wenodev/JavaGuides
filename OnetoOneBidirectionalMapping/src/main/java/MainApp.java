import dao.InstructorDao;
import entity.Instructor;
import entity.InstructorDetail;

public class MainApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("juwon", "son","aaa@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("www.naer.com","soccer");

        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);

        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);

//        System.out.println("Instructor : " + instructor.getInstructorDetail().getYoutubeChannel());
//        System.out.println("InstructorDetail : " + instructorDetail.getInstructor().getFirstName());



    }
}
