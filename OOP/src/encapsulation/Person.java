package encapsulation;

public class Person {

    private double id;
    private String name;

    public Person(){
        id = Math.random();
        sayHello();
    }

    private void sayHello(){
        System.out.println("Hello - " + getId());
    }

    public double getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
