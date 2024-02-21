public class AlphabetHalfTriangle {
    public static void main(String[] args) {
        int row=5;
        for (int i = 0; i < row; i++) {
            int alpha = 65;
            for (int j = 0; j <=i; j++) {
                System.out.print(((char)alpha));
                alpha++;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = row; i >0; i--) {
            char alpha = 65;

            for (int j = 1; j <=i; j++) {
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
}
