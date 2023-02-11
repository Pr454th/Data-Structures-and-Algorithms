import java.util.*;

public class qucikSort{

    public static int Partition(int[] A,int start,int end){
        int last=A[end];
        int i=start;
        int j=start;
        while(j<=end-1){
            if(A[j]<last){
                int temp=A[j];
                A[j]=A[i];
                A[i]=A[j];
                i++;
            }
            j++;
        }
        int temp=A[end];
        A[end]=A[i];
        A[i]=temp;
        return i;
    }

    public static void quickSortArray(int[] A,int start,int end){
        if(start<end){
            int pivot=Partition(A,start,end);
            quickSortArray(A,start,pivot-1);
            quickSortArray(A,pivot+1,end);
        }
    }

    public static void main(String[] args){
        int[] nums={5,4,3,2,1};
        quickSortArray(nums,0,nums.length-1);
        for(int n:nums) System.out.println(n);
    }
}