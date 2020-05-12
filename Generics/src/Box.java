public class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        Box type = new Box();
        type.set("String");
        System.out.println(type.get());

        Box type1 = new Box();
        type1.set(100);
        System.out.println(type1.get());

        Integer integer = (Integer) type.get();
        System.out.println(integer);
    }
}