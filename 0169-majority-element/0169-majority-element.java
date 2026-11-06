class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int cnt=0;
        for(int value:nums){
            if(cnt==0){
                el=value;
            }
            if(value==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
        
    }
}