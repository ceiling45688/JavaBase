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
    //折半查找  本题不适用!!!!错了！！！！
    static int solution(int[] nums, int target){
        int low = 1, high = nums.length;
        int mid=0;
        if (nums[low-1] >= target){
            return low-1;
        }
        if (nums[high-1] < target){
            return high;
        }else if (nums[high-1] == target){
            return high-1;
        }
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target) {return mid;}
            else if (nums[mid] > target){
                high = mid -1;
            }else {
                low = mid + 1;
            }
            System.out.println("mid = " + mid);
        }
        return mid;
    }


    public static void main(String[] args){
        int[] n =  {1,3,5};
//        System.out.println(searchInsert(n,0));
        System.out.println(solution(n,4));
    }
}
