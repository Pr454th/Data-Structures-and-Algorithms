// 11. Find a missing number in a given integer array of 1 to 100? 
import java.util.*;

public class q1{
    public static void main(String[] args){
        int[] nums={1,2,3,4,6,7,8,9,10};
        Arrays.sort(nums);
        int k=0;
        for(int i=1;i<=10;i++){
            if(nums[k++]!=i){
                System.out.println(i);
                break;}
        }
    }
}