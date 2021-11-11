package tree;

public class SymmetricBinaryTreeWithRecursion {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1.val == t2.val
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null));
        root.right = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null));

        System.out.println(isSymmetric(root));
    }
}
