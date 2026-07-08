class Solution {
    public int maxArea(int[] heights) {
        int left =0,right = heights.length-1;
        int area = 0;
        int max_area = 0;
        while(left<right){
            area = Math.min(heights[left],heights[right])*(right-left);
            max_area = Math.max(area,max_area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;
    }
}
