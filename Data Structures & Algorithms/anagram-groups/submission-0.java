class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp = new HashMap<>();
        for(String str:strs){
            int[] freq = new int[26];
            for(char ch:str.toCharArray()){
                freq[ch -'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int cnt:freq){
                key.append(cnt).append("#");
            } 
            String k = key.toString();
            mpp.putIfAbsent(k,new ArrayList<>());
            mpp.get(k).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}
