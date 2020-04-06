package polymorphism;

class Bike {
    int speedlimit = 90;

    void draw() {
        System.out.println("Bike...");
    }
}

public class PolymorphismTest3 extends Bike {

    void draw() {
        System.out.println("PolymorphismTest3...");
    }

    int speedlimit = 150;

    public static void main(String[] args) {

        Bike bike = new PolymorphismTest3();
        System.out.println(bike.speedlimit);
        bike.draw();
    }
}
