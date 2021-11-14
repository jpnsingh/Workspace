package tree;

import java.util.Stack;

public class TreePathSumWithIteration {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(targetSum - root.val);

        TreeNode node;
        int currentSum;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            currentSum = sumStack.pop();

            if (node.left == null && node.right == null && currentSum == 0) {
                return true;
            }

            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(currentSum - node.left.val);
            }
            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(currentSum - node.right.val);
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        int targetSum = 22;
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null);
//        root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));

        int targetSum = 5;
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, new TreeNode(1), null);

        System.out.println(hasPathSum(root, targetSum));
    }
}
