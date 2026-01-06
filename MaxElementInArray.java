public class MaxElementInArray {
    public static void main(String[] args){

        int[] arr = {13,37,68,43,65,70,56,99};
        int n = arr.length;
        
        int max = arr[0];

        for ( int i = 1; i< n; i++){
            if ( arr[i]>max ) {
                max = arr[i];
            }
        }
        System.out.println("max element in the array is: "+ max);
    }
    
}
