public class SwapUsingArray {

    public static void main(String[] args){
        
        // Initialize numbers in an array
        int[] nums = { 9, 5 };

        System.out.println("Before swapping: m = " + nums[0]
                           + ", n = " + nums[1]);

        // Call the method to swap the numbers
        swapArray(nums);

        // Print the numbers after swapping
        System.out.println(
            "After swapping using array: m = " + nums[0]
            + ", n = " + nums[1]);
    }

    // Method to swap numbers in an array
    public static void swapArray(int[] arr){
        
        // Temporary variable to hold the first value
        int temp = arr[0];
        
        // Assign second value to first
        arr[0] = arr[1];
        
        // Assign temporary value to second
        arr[1] = temp; 
    }
}
