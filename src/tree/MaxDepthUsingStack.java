package tree;

import java.util.LinkedList;
import java.util.Stack;

public class MaxDepthUsingStack {
    private static int maxDepth(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();

        if (root == null) {
            return 0;
        }

        nodeStack.push(root);
        depthStack.add(1);
        int depth = 0;
        int currDepth;
        while (!nodeStack.isEmpty()) {
            root = nodeStack.pop();
            currDepth = depthStack.pop();
            if (root != null) {
                depth = Math.max(depth, currDepth);
                nodeStack.add(root.left);
                nodeStack.add(root.right);
                depthStack.add(currDepth + 1);
                depthStack.add(currDepth + 1);
            }
        }

        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println(maxDepth(root));
    }
}
