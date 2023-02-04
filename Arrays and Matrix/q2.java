// 12. Find the duplicate number on a given integer array?
// 15. Find duplicate numbers in an array if it contains multiple duplicates?
import java.util.*;

public class q2{
    public static void main(String[] args){
        int[] nums={2,2,3,4,6,7,8,9,10};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            if(!hm.containsKey(n)){
                hm.put(n,1);
            }
            else{
                hm.put(n,hm.get(n)+1);
                if(hm.get(n)>1) System.out.println(n);
            }
        }
    }
}