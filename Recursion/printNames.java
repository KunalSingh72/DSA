public class printNames {
        public static void main(String[] args) {
        
            printNames pn = new printNames();
            int n=0;
            pn.names(n);
        }
        void names(int x){
            if(x==5)    return;
            names(++x);
            System.out.println("hello");
    }

}
