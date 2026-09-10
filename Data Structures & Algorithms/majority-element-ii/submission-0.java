class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer>mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])>n/3 && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
       return ans;
    }
}