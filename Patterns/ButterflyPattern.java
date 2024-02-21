//Butterfly Pattern
public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows * 2); j++) {
                if (j <= i || j >= ((rows * 2) - (i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= (rows * 2); j++) {
                if (j <= i || j >= ((rows * 2) - (i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
