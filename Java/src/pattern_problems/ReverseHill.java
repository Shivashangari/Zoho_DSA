package pattern_problems;

public class ReverseHill {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            for (int column2 = row; column2 < n; column2++) {
                System.out.print("* ");
            }
            for (int column2 = row; column2 <= n; column2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
