public class BinaryPattern {
    public static void main(String[] args) {
        int row = 14;
        for(int i = 1; i <= row; i++) {
            for(int j=1;j<=i;j++){
                if((j%2==1 && i%2==1) || (j%2==0 && i%2==0)) {
                    System.out.print("1 ");
                }

                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}