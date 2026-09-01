class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxAea = 0;
        for(int i=0; i<=heights.length; i++){
            int h = i == heights.length ? 0 : heights[i];

            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int hight = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                
                int area = hight * width;
                maxAea = Math.max(maxAea,area);
            }
            stack.push(i);
        }
        return maxAea;
    }
}