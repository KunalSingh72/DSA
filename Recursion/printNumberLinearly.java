public class printNumberLinearly {
    public static void main(String[] args) {
        
        printNumberLinearly pn = new printNumberLinearly();
        int n=1;
        pn.numbers(n);
    }
    void numbers(int x){
        if(x>5)    return;
        System.out.println(x);
        numbers(++x);
        
}
}
