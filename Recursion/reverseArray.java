public class reverseArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        reverseArray re = new reverseArray();
        re.reversed(0, arr, arr.length);

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    void reversed(int i, int[] a, int n){
        if(i>=n/2)  return;

        int temp = a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = temp;
        reversed(i+1, a, n);
    }
}
