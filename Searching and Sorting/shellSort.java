import java.util.*;

public class shellSort{
    public void sort(int[] nums,int n){
        for(int k=n/2;k>0;k/=2){
            for(int i=k;i<n;i++){
                int temp=nums[i];
                int j;
                for(j=i;j>=k && nums[j-k]>temp;j-=k){
                    nums[j]=nums[j-k];
                }
                nums[j]=temp;
            }
        }
    }
    public static void main(String[] args){
        shellSort ss=new shellSort();
        int[] nums={5,4,3,2,1};
        ss.sort(nums,nums.length);
        for(int n:nums) System.out.println(n);
    }
}