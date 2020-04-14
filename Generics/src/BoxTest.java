public class BoxTest<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        BoxTest<String> type = new BoxTest<>();
        type.set("String");

        BoxTest<Integer> type1 = new BoxTest<>();
        type1.set(100);
  
//       Integer integer = (Integer) type.get(); // compiler error
//        System.out.println(integer);
    }
}