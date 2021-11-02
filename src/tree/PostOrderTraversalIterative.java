package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * l r n
 */
public class PostOrderTraversalIterative {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversedList = new ArrayList<>();
        if (root == null) {
            return traversedList;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        TreeNode previous = null;

        while (!nodeStack.isEmpty()) {
            TreeNode current = nodeStack.peek();
            if (previous == null || previous.left == current || previous.right == current) {
                if (current.left != null) {
                    nodeStack.push(current.left);
                } else if (current.right != null) {
                    nodeStack.push(current.right);
                }
            } else if (current.left == previous) {
                if (current.right != null) {
                    nodeStack.push(current.right);
                }
            } else {
                traversedList.add(current.val);
                nodeStack.pop();
            }
            previous = current;
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3, null, null), null);
        root.right = new TreeNode(4, new TreeNode(5), new TreeNode(6, null, null));
        System.out.println("Output : " + postorderTraversal(root));
    }
}
