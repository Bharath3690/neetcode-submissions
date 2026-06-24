class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] cnt = new int[256];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)]++;
            cnt[t.charAt(i)]--;
        }
        for(int val:cnt){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
