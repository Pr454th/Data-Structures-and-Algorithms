class Solution {
    public int matrixMedian(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] arr=new int[m*n];
        int k=0;
        for(int[] x:grid){
            for(int y:x){
                arr[k++]=y;
            }
        }
        Arrays.sort(arr);
        int mid=k/2;
        return arr[mid];
    }
}