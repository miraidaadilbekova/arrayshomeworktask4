import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int[] nums = { 20, 30, 40, 50, 60};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original nums: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("Enter your index to remove: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= nums.length) {
            System.out.println("Your index is invalid!");
        } else {
            for (int i = index; i < nums.length - 1; i++){
                nums[i] = nums[i + 1];
            }
            System.out.print(" Updated: ");
            for( int i = 0; i < nums.length - 1; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
