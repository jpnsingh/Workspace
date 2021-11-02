package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * l n r
 */
public class InOrderTraversalIterative {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversedList = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode current = root;
        while (current != null || !nodeStack.isEmpty()) {
            while (current != null) {
                nodeStack.push(current);
                current = current.left;
            }

            current = nodeStack.pop();
            traversedList.add(current.val);
            current = current.right;
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, new TreeNode(4), null);

        System.out.println(inorderTraversal(root));
    }
}
