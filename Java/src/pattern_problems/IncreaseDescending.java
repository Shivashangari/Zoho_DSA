package pattern_problems;

public class IncreaseDescending {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for (int column1=1;column1<=row;column1++){
                System.out.print(" ");
            }
            for (int column2=row;column2<=n;column2++){
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
