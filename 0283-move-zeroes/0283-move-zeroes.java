class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != 0 ){
                if(nums[start] != 0){
                    start++;
                }
                if(i == start){
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;

                start++;
            }
        }
        
    }
}