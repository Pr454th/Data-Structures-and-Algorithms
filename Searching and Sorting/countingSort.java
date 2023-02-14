import java.util.*;

public class countingSort{

    void sort(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        int max=0;
        for(int x:nums){
            if(x>max) max=x;
        }
        int[] temp=new int[max+1];
        Arrays.fill(temp,0);
        for(int i=0;i<n;i++){
            temp[nums[i]]++;
        }
        for(int i=1;i<=max;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=0;i<n;i++){
            res[temp[nums[i]-1]]=nums[i];
            temp[nums[i]]--;
        }
        int index=0;
        for(int k:res)
            nums[index++]=k;
    }

    public static void main(String[] args){
        countingSort cs=new countingSort();
        int[] nums={5,4,3,2,1};
        cs.sort(nums);
        for(int n:nums) System.out.println(n);
    }
}