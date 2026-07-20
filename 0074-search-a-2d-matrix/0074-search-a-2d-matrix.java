class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows=arr.length;
        int cols=arr[0].length;

        int i=0;
        int j=cols-1;
        while(i<rows && j>=0){
            if(arr[i][j]>target)j--;
            else if(arr[i][j]<target)i++;
            else return true;
        }
        return false;
        
    }
}