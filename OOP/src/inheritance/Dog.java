package inheritance;

public class Dog extends Animal {

    private void bark(){
        System.out.println("Dog" + getId() + "is barking");
    }


    @Override
    public void sound() {
        bark();
    }
}
