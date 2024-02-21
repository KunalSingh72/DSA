//Floyd Triangle
public class FloydTriangle {
    public static void main(String[] args) {
        int row=5;
        int floyd=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(floyd+" ");
                floyd++;
            }
            System.out.println();
        }
    }
}
