package encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aaa");

        System.out.println("Person - " + person.getId() + " : " + person.getName());
    }

}
