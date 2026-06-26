class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mpp = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(
            (a,b)->mpp.get(a)-mpp.get(b)
        );
        for(Integer key:mpp.keySet()){
            pq.offer(key);
            while(pq.size()>k){
                pq.poll();
            }
        }
        for(int i = k-1;i>=0;i--){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
