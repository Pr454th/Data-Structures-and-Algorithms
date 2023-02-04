// 14. Find all pairs of integer arrays whose sum is equal to a given number?
import java.util.*;

public class q3{
    public static void main(String[] args){
        int[] nums={2,2,3,4,6,7,8,9,10};
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==9){
                System.out.println(nums[left]+","+nums[right]);
                left++;
                right--;
            }
            else if(sum<9) left++;
            else if(sum>9) right--;
        }
    }
}