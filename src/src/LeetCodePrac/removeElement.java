package LeetCodePrac;

public class removeElement {

    static int removeElement(int[] nums, int val) {
        int index = 0;//慢指针（可替换）
        int newlength = nums.length;
        int pos =0;//快指针（遍历）

        while(pos < nums.length){
            if(nums[pos] != val){
                nums[index] = nums[pos];
                index++;
            }else {
                newlength--;
            }
            pos++;

        }
        return newlength;
    }

    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
