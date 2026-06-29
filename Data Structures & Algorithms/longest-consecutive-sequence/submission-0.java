class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>set = new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       int longest = 0;
       for(int it:set){
        if(!set.contains(it-1)){
            int curr = it;
            int cnt = 1;
            while(set.contains(curr+1)){
                curr = curr+1;
                cnt++;
            }
        longest = Math.max(longest,cnt);
        }
       }
       return longest;
    }
}
