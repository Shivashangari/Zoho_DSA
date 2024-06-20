package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistExample {
    public void arraylist() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Pooja");
        arrayList.add("Vijay");
        arrayList.add("Geetha");
        arrayList.add("Sekar");


        //Print all the values

        System.out.println("The values in the list" + arrayList);


        //Index()
        int indexCheck = arrayList.indexOf("Sekar");
        System.out.println("Index of: " + indexCheck);

        //LastIndexOf()
        int lastIndex = arrayList.lastIndexOf("Geetha");
        System.out.println("Last Index of:" + lastIndex);


        //Get values through the inex number
        System.out.println("Get the values thorugh index:" + arrayList.get(0));


        List<String> duplicateList = new ArrayList<String>();
        duplicateList.addAll(arrayList);
        System.out.println("------New List----" + duplicateList);
        //remove single element
        System.out.println("Remove element:" + duplicateList.remove(0));
        System.out.println(duplicateList);

        duplicateList.clear();
        System.out.println("New List:" + duplicateList);

        duplicateList.add(0, "Pooja");
        duplicateList.add(1, "Geetha");
        System.out.println("*****After setting new  elements:" + duplicateList);

        duplicateList.set(0, "Vijay");
        System.out.println("Updating the element using set: " + duplicateList);


        for (String string : duplicateList) {
            System.out.println(string);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ListIterator<String> iterator=arrayList.listIterator();
       while (iterator.hasNext()){
           System.out.println("*****Using List Iterator:"+iterator.next());
       }
    }


    public static void main(String[] args) {
        ArraylistExample arraylistExample = new ArraylistExample();
        arraylistExample.arraylist();
    }
}

