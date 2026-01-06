public class AccessArrayElement { 
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index = 3;   // index to access

        // Check index validity
        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    
    
}
