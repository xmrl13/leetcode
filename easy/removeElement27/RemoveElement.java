package easy.removeElement27;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        // 2
        System.out.println(removeElement.removeElement(new int[]{3,2,2,3}, 3));
        // 5
        System.out.println(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public int removeElement(int[] nums, int val) {

        int unicos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[unicos] = nums[i];
                unicos++;
            }
        }
        return unicos;
    }
}
