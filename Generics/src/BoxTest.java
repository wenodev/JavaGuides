public class BoxTest {
    public static void main(String[] args) {

        Box type = new Box();
        type.setObject("String");
        System.out.println(type.getObject());

        Box type1 = new Box();
        type1.setObject(100);
        System.out.println(type1.getObject());

        String str = (String) type1.getObject();
        System.out.println(str);

    }
}
