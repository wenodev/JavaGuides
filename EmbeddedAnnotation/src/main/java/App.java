import entity.Address;
import entity.Name;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Name name = new Name("JUWON", "M", "SON");
        Address address = new Address("111", "2222","haha", "sssss", "asdasda","123123");
        User user = new User(name, "jj@gmail.com", address);

        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
