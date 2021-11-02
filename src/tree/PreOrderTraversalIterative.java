package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * n l r
 */
public class PreOrderTraversalIterative {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversedList = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        if (root != null) {
            nodeStack.push(root);
        }
        TreeNode current;

        while (!nodeStack.isEmpty()) {
            current = nodeStack.pop();
            traversedList.add(current.val);
            if (current.right != null) {
                nodeStack.push(current.right);
            }
            if (current.left != null) {
                nodeStack.push(current.left);
            }
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, new TreeNode(4), null);

        System.out.println(preorderTraversal(root));
    }
}
