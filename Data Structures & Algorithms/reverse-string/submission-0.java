class Solution {
    public void reverseString(char[] s) {
       int start = 0;
       int end = s.length;
       for(int i=start;i<end;i++){
        char temp = s[start];
        s[start] = s[end-1];
        s[end-1] = temp;
        start++;
        end--;
       }
    }
}