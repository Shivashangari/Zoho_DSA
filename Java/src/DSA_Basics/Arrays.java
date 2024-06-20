package DSA_Basics;

public class Arrays {
    public void singleDimensionalArray() {
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 400;
        a[3] = 500;
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        for (int r : a) {
            System.out.println(r);
        }

    }

    public void towDimensionalArray() {
        //     int a[][] = new int[3][3];
//        a[0][0] = 100;
//        a[0][1] = 200;
//        a[0][2] = 300;
//
//
//        a[1][0] = 101;
//        a[1][1] = 201;
//        a[1][2] = 301;
//
//        a[2][0] = 102;
//        a[2][1] = 202;
//        a[2][2] = 302;

        int twodarray[][] = {{100, 200, 300},
                {101, 102, 103},
                {102, 202, 302}};
//        System.out.println(a.length);
//
//
//        System.out.println(a[0][0]);

//        for(int r=0;r<a.length;r++){
//           for(int c=0;c<a[0].length;c++){
//               System.out.println(a[r][c]);
//           }
//        }
        for (int row[] : twodarray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public void objectDataTypes() {
        Object a[] = {1, 1.5, "Pooja"};
        for (Object output : a) {
            System.out.println(output);
        }
    }

    public void findTheSearchElement() {
        int number[] = {10, 20, 30, 40, 60, 80};
        int findElement = 1000;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == findElement) {
                System.out.println("The number is find");
                break;
            } else {
                System.out.println("The number is not find");
                break;
            }

        }
    }
    public void findTheSearchElement1() {
        int number[] = {10, 20, 30, 40, 60, 80};
        int findElement = 10;
        for (int findnumber:number){
            if (findnumber==findElement){
                System.out.println("The number is found");
                break;
            }
            else {
                System.out.println("The number not found");
                break;
            }
        }
        }


    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        //arrays.singleDimensionalArray();
        //arrays.towDimensionalArray();
        //arrays.objectDataTypes();
        //arrays.findTheSearchElement();
        arrays.findTheSearchElement1();
    }

}
