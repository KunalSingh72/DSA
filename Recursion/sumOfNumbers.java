public class sumOfNumbers {
    public static void main(String[] args) {
        
        sumOfNumbers pn = new sumOfNumbers();
        int n=5;
        int ans = pn.printSum(n);
        System.out.println(ans);
    }
    int printSum(int n){
        if(n!=0) return n + printSum(n-1) ;
        return n;
    }

}
