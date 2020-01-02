package LeetCodePrac;
/**Remove Duplicates from Sorted Array:
 Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/
public class removeDuplicates {
//   static int removeDuplicates(int[] nums) {
//        /*当数组为null或没元素时直接返回
//        if(nums==null||nums.length<1){
//            return 0;
//        }
//        /*定义一个可替换下标指针，从第二个元素开始*/
//        int index=1;
//        /*定义没有重复元素的数组长度*/
//        int newLength=1;
//        /*定义一个遍历指针，从第二个元素开始，要小于数组大小*/
//        int p=1;
//        while (p<nums.length){
//            /*当前元素与前一个元素不相等时，给index处下标赋值为p处下标的值，并且index+1和没有重复元素的数组长度加1*/
//            if(nums[p]!=nums[p-1]){
//                nums[index++]=nums[p];
//                newLength++;
//            }
//            p++;
//        }
//        return newLength;
//
//    }
//学习的别人的代码，我现在明白两个指针的用法了。
    static int removeDuplicates(int[] nums){
        if (nums == null || nums.length < 1) {return 0;}
        int index = 1;//慢指针（可替换）
        int newLength = 1;
        int pos = 1;//快指针（遍历）

        while(pos < nums.length){
            if(nums[pos] != nums[pos-1]){
                nums[index] = nums[pos];
                index++;
                newLength++;
            }
            pos++;
        }

        return newLength;
    }



    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
