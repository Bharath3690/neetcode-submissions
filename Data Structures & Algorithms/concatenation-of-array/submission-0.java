class Solution {
    public int[] getConcatenation(int[] nums) {
        int newlen = nums.length*2;
        int[] ans = new int[newlen]; 
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        int k=0;
        for(int j=nums.length;j<ans.length;j++){
            ans[j] = nums[k++];
        }
        return ans;
    }
}