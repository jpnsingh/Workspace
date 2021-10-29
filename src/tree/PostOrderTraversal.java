package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * l r n
 */
public class PostOrderTraversal {
    private static List<Integer> traversedList = new ArrayList<>();

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            traversedList.add(root.val);
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(3), null);

        System.out.println(postorderTraversal(root));
    }
}
