package boundedtype;

public class ClassLevelGeneric <T extends A> {

    private T t;

    public ClassLevelGeneric(T t){
        this.t = t;
    }

    public void doRunTest() {
        this.t.displayClass();
    }

    public static void main(String[] args) {

        // Creating object of sub class C and
        // passing it to Bound as a type parameter.
        ClassLevelGeneric<C> bec = new ClassLevelGeneric<C>(new C());
        bec.doRunTest();

        // Creating object of sub class B and
        // passing it to Bound as a type parameter.
        ClassLevelGeneric<B> beb = new ClassLevelGeneric<B>(new B());
        beb.doRunTest();

        // similarly passing super class A
        ClassLevelGeneric<A> bea = new ClassLevelGeneric<A>(new A());
        bea.doRunTest();

    }
}


class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}
