public class checkPalindrome {
    public static void main(String[] args) {
        
        String str = "MDAM";
        checkPalindrome c = new checkPalindrome();
        

        System.out.println(c.check(0, str, str.length()));
    }
    boolean check(int i,String S, int n){
        if(i>=n/2)  return true;
        if(S.charAt(i)!=S.charAt(n-i-1))    return false;

        return check(i+1, S, n);
    }
}
