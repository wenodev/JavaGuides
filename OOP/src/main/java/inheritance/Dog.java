package inheritance;

public class Dog extends Animal {

    public Dog(){
        System.out.println("Dog");
    }


    private void bark(){
        System.out.println("Dog" + getId() + "is barking");
    }

    @Override
    public void sound() {
        bark();
    }
}
