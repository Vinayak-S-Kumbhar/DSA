class MinStack {
    private final Stack<Long> stack = new Stack<>();
    private long min;

    public MinStack() {
    }

    public void push(int value) {
        long val = value;

        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
        } else if (val < min) {
            // Store encoded value
            stack.push(2 * val - min);
            min = val;
        } else {
            stack.push(val);
        }
    }

    public void pop() {
        long top = stack.pop();

        if (top < min) {
            // Restore previous minimum
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = stack.peek();

        if (top < min) {
            return (int) min;
        }

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */