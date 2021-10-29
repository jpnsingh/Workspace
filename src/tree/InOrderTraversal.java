package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * l n r
 */
public class InOrderTraversal {
    private static List<Integer> traversedList = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            traversedList.add(root.val);
            inorderTraversal(root.right);
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(3), null);

        System.out.println(inorderTraversal(root));
    }
}
