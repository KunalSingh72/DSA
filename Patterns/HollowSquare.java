public class HollowSquare {
    public static void main(String[] args) {
        int rows=4;
        int column=4;

        for(int i =1; i<=rows; i++){
            if(i==1 || i==rows){
                for(int j=1;j<=column;j++)
                    System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int k =1; k<=column-2; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
