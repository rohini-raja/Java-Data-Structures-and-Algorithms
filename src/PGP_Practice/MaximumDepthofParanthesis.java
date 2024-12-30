package PGP_Practice;

public class MaximumDepthofParanthesis {
    public int maxDepth(String s) {
        //TC - O(N), SC- O(1)
        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(currentDepth, maxDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        MaximumDepthofParanthesis solution = new MaximumDepthofParanthesis();

        // Test cases
        String[] testCases = {
                "(1+(2*3)+((8)/4))+1",
                "(1)+((2))+(((3)))",
                "1+(2*3)/(2-1)",
                "1"
        };

        for (String s : testCases) {
            int result = solution.maxDepth(s);
            System.out.println("Input: " + s);
            System.out.println("Maximum Depth: " + result);
            System.out.println();
        }
    }
}
