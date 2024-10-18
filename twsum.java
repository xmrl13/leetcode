import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        
        int nums [] = {3,3};
        int target = 6;

        System.out.println(twoSum(nums, target));
    }

    
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0 ; i < nums.length; i++){
            
            int complemento = target - nums[i];

            if (map.containsKey(complemento)) {
                return new int[] {map.get(complemento), i};
            }
            map.put(nums[i], i);

        } return new int[]{};

    }
}