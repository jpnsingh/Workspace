package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * n l r
 */
public class PreOrderTraversal {
    private static List<Integer> traversedList = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            traversedList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(3), null);

        System.out.println(preorderTraversal(root));
    }
}
