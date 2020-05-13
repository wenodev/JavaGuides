import dao.CourseDao;
import dao.InstructorDao;
import entity.Course;
import entity.Instructor;

public class MainApp {

    public static void main(String[] args) {

        InstructorDao instructorDao = new InstructorDao();
        CourseDao courseDao = new CourseDao();

        Instructor instructor = new Instructor("juwon", "son", "aaa@gmail.com");
        instructorDao.saveInstructor(instructor);

        Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
        tempCourse1.setInstructor(instructor);
        courseDao.saveCourse(tempCourse1);

        Course tempCourse2 = new Course("The Ponball MasterClass");
        tempCourse2.setInstructor(instructor);
        courseDao.saveCourse(tempCourse2);

    }


}
