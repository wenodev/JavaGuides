package ListInterface.ArrayListClass;

import javax.print.DocFlavor;
import java.util.*;

public class ListInterfaceArrayListImpl {

    private static void printMessage(List<String> list, String message) {
        list.forEach(key -> System.out.println(message + key));
    }

    private static void nullValueDemo(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println(list.toString());
    }

    private static void duplicateValueDemo(){
        List<String> list = new ArrayList<>();
        list.add("duplicate");
        list.add("duplicate");
        System.out.println(list);
        System.out.println(list.toString());
    }

    private static void positionalAccess(){
        List<String> list = new LinkedList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        list.set(3,"element 5");
        list.forEach(str -> System.out.println("set element 5 -- " + str));
        System.out.println();

        list.add(3, "element 4");
        list.forEach(str -> System.out.println("set element 5 -- " + str));
        System.out.println();

        System.out.println(list.get(0));
        System.out.println();

        list.remove(1);
        list.forEach(str -> System.out.println("set element 5 -- " + str));

    }

    private static void searchListDemo(){

        List<String> searchList = new ArrayList<>();
        searchList.add("element 1");
        searchList.add("element 2");
        searchList.add("element 3");
        searchList.add("element 4");
        searchList.add("element 2");

        System.out.println(searchList);
        System.out.println();

        int index = searchList.indexOf("element 2");
        System.out.println("search element at index 0 ----> " + index);

        int lastIndex = searchList.lastIndexOf("element 2");
        System.out.println("search elemnet at lastIndex 0 ---> " + lastIndex);
    }

    private static void rangeViewDemo(){
        List<String> list = new LinkedList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        for(String aaa : list){
            System.out.println(aaa);
        }

        for(String str : list.subList(0,1)){
            System.out.println("sub list demo : " + str);
        }
    }

    private static void bulkOperationDemo(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

//        List<String> union = new ArrayList<>();
//        union.addAll(list);
//        printMessage(union, "addAll operation example");
//

//        List<String> intersection = new ArrayList<>();
//        intersection.add("element 1");
//        intersection.add("element 2");
//        intersection.add("element 3");
//        intersection.add("element 4");
//        System.out.println("retainAll ---> " + intersection.retainAll(list));
//        printMessage(intersection, "retainAll operation example");

//        List<String> difference = new ArrayList<>();
//        difference.add("element 1");
//        difference.add("element 2");
//        difference.add("element 3");
//        difference.add("element 4");
//        difference.add("element 5");
//
//        printMessage(difference, "removeAll operation example");
//        System.out.println("removeAll operation example --->" + difference.removeAll(list));
//        printMessage(difference, "removeAll operation example");

        List<String> checking = new ArrayList<>();
        checking.add("element 1");
        checking.add("element 2");
        checking.add("element 3");

        System.out.println("containsAll operation example ----> " + checking.containsAll(list));
    }

    private static void iterateDemo(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        //using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        //using advanced for loop
        for(String str : list){
            System.out.println(str);
        }

        //Java 8
        list.forEach(str -> System.out.println(str));
    }

    private static void listIterateDemo(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        ListIterator<String> iterator = list.listIterator();



        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println("forward direction --- " + str);
        }

        while (iterator.hasPrevious()) {
            String str = iterator.previous();
            System.out.println("backward direction ---" + str);
        }

        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
            String t = it.previous();
            System.out.println(t);
        }
    }





    public static void main(String[] args) {

//        nullValueDemo();
//        duplicateValueDemo();
//        positionalAccess();
//        searchListDemo();
//        rangeViewDemo();
//        bulkOperationDemo();
//        iterateDemo();
//        listIterateDemo();
    }






}
