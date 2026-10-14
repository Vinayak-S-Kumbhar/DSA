class Solution {
    public int search(int[] nums, int target) {
        return find(nums, target, 0, nums.length - 1);
    }

    public int find(int[] nums, int target, int start, int end){
        int mid = start + (end - start) / 2;

        if(start > end){
            return -1;
        }

        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[mid] < target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }

        return find(nums, target, start, end);
    }
}