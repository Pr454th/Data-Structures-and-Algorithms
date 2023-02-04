// 16. Remove duplicates from the given array in Java?
import java.util.*;

public class q4{
    public static void main(String[] args){
        int[] nums={2,2,3,4,6,7,8,9,10};
        int[] res=new int[nums.length];
        int k=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            if(!hm.containsKey(n)){
                hm.put(n,1);
                res[k++]=n;
            }
        }
        for(int n:Arrays.copyOf(res,k)){
            System.out.println(n);
        }
    }
}