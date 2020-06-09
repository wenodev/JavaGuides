public class CountNumberOfWordsInString {

    public static void main(String[] args) {

        method1();
        method2();
        method3();

    }

    public static void method1(){
        String str = "java developers guide";
        String[] strArray = str.split(" ");
        System.out.println("Number of words in a string = " + strArray.length);
    }

    public static void method2() {
        String str = "java developers guide";
        int count = 0;
        for (String word : str.split(" ")){
            count ++;
        }
        System.out.println("Number of words in a string = " +  count);
    }

    public static void method3() {
        String str = "java developers guide";

        int count = 1;

        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                count ++;
            }
        }

        System.out.println("Number of words in a string = " + count);


    }


}
