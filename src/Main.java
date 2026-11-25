public class Main{
    public static void main(String[] args) {
        int[] nums = {1,34,5,56,7,-8,-19,6,-13,15};
        int count = 0;
        System.out.println("Original: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
                count++;
            }
        }
        System.out.print("Changed: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("Replacements: " + count);
    }
}
