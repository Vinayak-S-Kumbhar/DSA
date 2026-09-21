class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> anser = new HashSet<>();
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;;

        for(int i=0; i<nums.length-1; i++){
            start = i+1;
            end=nums.length-1;

            while(start < end){
                int total = nums[i] + nums[start] + nums[end];

                if(total == 0){
                    anser.add(List.of(nums[i] , nums[start] , nums[end]));
                }
                if(total < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(anser);
        return ans;
    }
}