class Solution {
    public int maxArea(int[] heights) {
        int L =0;
        int area=0;
        int max = 0;
        int R =heights.length-1;
        while(L< R){
            area = (R-L) * Math.min(heights[L], heights[R]);
            max = Math.max(max,area);

            if( heights[L] <= heights[R]){
                L++;
            } else {
               R--;

            }
        }
    

        return max;

    }
}
