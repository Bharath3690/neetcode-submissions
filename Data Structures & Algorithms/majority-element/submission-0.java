class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = -1;
        HashMap<Integer,Integer>mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])>n/2){
                ans = nums[i];
            }
        }
        return ans;
    }
}