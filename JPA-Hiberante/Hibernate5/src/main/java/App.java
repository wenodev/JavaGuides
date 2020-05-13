import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student("weno1", "son1", "aaa1@gmail.com");
        Student student2 = new Student("weno2", "son2", "aaa2@gmail.com");


        Transaction transaction = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            //start a transaction
            transaction = session.beginTransaction();

            //save the student objects
            session.save(student1);
            session.save(student2);

            //commit transaction
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            List<Student> students = session.createQuery("from Student", Student.class).list();
            students.forEach(s->System.out.println(s.getFirstName()));
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }


    }
}
