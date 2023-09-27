package check;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] num = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(num));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        Set<Integer> frequencies = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!frequencies.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
