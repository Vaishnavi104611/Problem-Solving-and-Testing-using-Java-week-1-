import java.util.Arrays;

public class KthSmallestElement {
    
    public static void main( String[] args){

        int[] arr = {6, 10, 3, 88, 59, 30, 44,};
        int k = 59;

        if (k<= 0 || k> arr.length) {
            System.out.println("invaild value of k");
            return;

        }
        Arrays.sort(arr);
       System.out.println("Kth smallest element is: " + arr[k - 1]);
         
    }
}
