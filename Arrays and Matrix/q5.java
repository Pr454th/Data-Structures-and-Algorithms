import java.util.*;

public class q5{
    public static void main(String[] args){
        int[] nums={1,2,3,0,3,3,7};
        int[] res=new int[nums.length];
        Arrays.sort(nums);
        int k=1;
        res[0]=nums[0];
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                res[k++]=nums[i];
            }
            prev=nums[i];
        }
        for(int n:Arrays.copyOf(res,k)){
            System.out.print(n);
        }
    }
}