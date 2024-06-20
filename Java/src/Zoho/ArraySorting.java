package Zoho;


public class ArraySorting {

    StringBuilder evennumber=new StringBuilder();
    StringBuilder oddnumber=new StringBuilder();
    public void sorting() {
        int arr[] = {1, 2, 3, 5, 4, 7, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                evennumber.append(arr[i]).append("");

            }

        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] % 2 != 0) {
                System.out.println(arr[j]);
                oddnumber.append(arr[j]).append("");

            }


        }
        System.out.println(evennumber.toString()+oddnumber.toString());
    }
    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.sorting();
    }
}
