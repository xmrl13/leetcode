package pivotIndex;

public class PivotIndex {

    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {

        int right = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                left = nums[i];
            }
            if(i>=1){
                left += nums[i-1];
                right -= nums[i];
            }
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
