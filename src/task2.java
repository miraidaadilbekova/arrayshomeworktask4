public class task2 {
    public static void main(String[] args) {
        int[] nums = {12,34,1,23,4,56};
        int largest = 0;
        int secondLargest = 0;
        System.out.println("Array: ");
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        System.out.println("Largest: " + largest);
        if (secondLargest == 0) {
            System.out.println("No second largest distinct number!");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }
    }
}
