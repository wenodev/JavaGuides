public class BoxTest {
    public static void main(String[] args) {

        Box type = new Box();
        type.set("String");
        System.out.println(type.get());

        Box type1 = new Box();
        type1.set(100);
        System.out.println(type1.get());

//        String str = (String) type1.get();
//        System.out.println(str);

    }
}
