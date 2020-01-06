package LeetCodePrac;

public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
            int index = nums.length;
            for (int i=0; i <= nums.length - 1; i++){
                System.out.println(nums[i]);
                if (nums[i] == target){return i;}
                if (nums[i] > target){
                    System.out.println(i);
                    return i;
                }

            }
            return index;
    }
    public static void main(String[] args){
        int[] n =  {1};
        System.out.println(searchInsert(n,0));
    }
}
