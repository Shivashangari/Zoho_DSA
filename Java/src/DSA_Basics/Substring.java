package DSA_Basics;

import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        String input="@15,20,30"; //152030
        String removeAnnotation=(input.replace("@","").replace(",",""));
        System.out.println(removeAnnotation);

        String s="abc,123@xyz";//abc 123 xyz
        String arr[]=s.split(",");
        //System.out.println(DSA_Basics.Arrays.toString(arr));
        String[] arr2 =arr[1].split("@");
        //System.out.println(DSA_Basics.Arrays.toString(arr2));
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String name="John Kennedy";
        String nameToLowerCase=name.toLowerCase();
        String check= String.valueOf(nameToLowerCase.contains("iohn"));
        System.out.println(check);



    }
}
