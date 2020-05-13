import dao.InstructorDao;
import entity.Course;
import entity.Instructor;

public class MainApp {
    public static void main(String[] args) {


        InstructorDao instructorDao = new InstructorDao();

        Instructor instructor = new Instructor("juwon", "son", "sdf@gmail.com");
        instructorDao.saveInstructor(instructor);

        //create some courses
        Course tempCourse1 = new Course("Learn Spring boot");
        instructor.getCourses().add(tempCourse1);

        Course tempCourse2 = new Course("Learn hibernate");
        instructor.getCourses().add(tempCourse2);

        instructorDao.saveInstructor(instructor);

    }
}
