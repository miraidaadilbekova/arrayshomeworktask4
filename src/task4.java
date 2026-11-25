public class task4 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 3, 15, 7, 7, 8};
        int replacements = 0;
        System.out.println("Original row: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Dublicate numbers: ");
        boolean foundAny = false;
        for (int i = 0; i < nums.length; i++){
            boolean Printed = false;
            for (int k = 0; k < i; k++){
                if (nums[k] == nums[i]) {
                    Printed = true;
                    break;
                }
            }
            if (Printed) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]) {
                    System.out.print(nums[i] + " ");
                    foundAny = true;
                    break;
                }
            }
        }
        if(!foundAny){
            System.out.println("No duplicates!");
        }
        System.out.println();
    }
}
