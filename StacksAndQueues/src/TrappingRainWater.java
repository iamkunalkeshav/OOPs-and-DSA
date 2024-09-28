import java.util.Stack;

class TrappingRainWater {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int waterTrapped = 0;
        int current = 0;

        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = current - stack.peek() - 1;
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                waterTrapped += distance * boundedHeight;
            }
            stack.push(current++);
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();

        // Test case 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water for height1: " + solution.trap(height1)); // Output should be 6

        // Test case 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water for height2: " + solution.trap(height2)); // Output should be 9
    }
}
