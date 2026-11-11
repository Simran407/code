class Solution {
    private void reverseRange(int[]nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return;
        }
        int pivot=n-2;
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        if(pivot<0){
            reverseRange(nums,0,n-1);
            return;
        }
        int successor=n-1;
        while(nums[successor]<=nums[pivot]){
            successor--;
        }
        int tempo=nums[pivot];
        nums[pivot]=nums[successor];
        nums[successor]=tempo;
        reverseRange(nums,pivot+1,n-1);
        
    }
}