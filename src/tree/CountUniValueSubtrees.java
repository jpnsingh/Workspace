package tree;

public class CountUniValueSubtrees {
    private static int count = 0;

    public static int countUniValueSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        isUniValue(root);
        return count;
    }

    private static boolean isUniValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            count++;
            return true;
        }

        boolean isUni = true;

        if (root.left != null) {
            isUni = isUniValue(root.left) && root.val == root.left.val;
        }

        if (root.right != null) {
            isUni = isUniValue(root.right) && isUni && root.val == root.right.val;
        }

        if (!isUni) {
            return false;
        }

        count++;
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5, new TreeNode(5), new TreeNode(5));
        root.right = new TreeNode(5, null, new TreeNode(5));
        System.out.println(countUniValueSubtrees(root));
    }
}
