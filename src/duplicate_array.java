import java.util.HashSet;
public class duplicate_array {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }
        return set.size();

    }

    public static void main(String[] args) {
        int[] arr={0,1,2,1,2,4,5};
        System.out.println( duplicate_array.removeDuplicates(arr));

    }
}
