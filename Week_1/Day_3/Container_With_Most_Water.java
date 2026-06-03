class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int beg = 0, end = height.length-1;
        int total = 0, mul = 0;
        while(beg < end){
            mul = ((end+1) - (beg+1)) * Math.min(height[end], height[beg]);
            total = Math.max(mul,total);
            if(height[beg] < height[end]){
                beg++;
            }
            else{
                end--;
            }
        }
        return total;
    }
}
