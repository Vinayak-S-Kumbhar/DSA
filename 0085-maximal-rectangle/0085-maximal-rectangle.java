class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int[] hights = new int[matrix[0].length];
        int maxArea = 0;
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col] == '1'){
                    hights[col] += 1;
                }else{
                    hights[col] = 0;
                }
            }

            maxArea = Math.max(maxArea, largestRectangleArea(hights));
        }

        return maxArea;
    }

    public int largestRectangleArea(int[] hights){
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=hights.length; i++){
            int h = i == hights.length ? 0 : hights[i];
            while(!stack.isEmpty() && h < hights[stack.peek()]){
                int hight = hights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;

                int area = hight * w;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}