import java.util.*;

public class mergeSort{
    public static void mergesort(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] arr,int st,int md,int ed){
        int n1=md-st+1;
        int n2=ed-md;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i=0,j=0;
        int k=st;
        for(i=0;i<n1;i++){
            left[i]=arr[st+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[md+j+1];
        }
        i=0;j=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }

    }
    public static void main(String[] args){
        int[] nums={5,4,3,2,1};
        mergesort(nums,0,nums.length-1);
        for(int n:nums){
            System.out.println(n);
        }
    }
}