package tree;

public class CountUniValueSubtreesDFSParameterized {
    private static int count = 0;

    public static int countUniValueSubtrees(TreeNode root) {
        isValidSubTree(root, 0);
        return count;
    }

    private static boolean isValidSubTree(TreeNode root, int value) {
        if (root == null) {
            return true;
        }

        if (!isValidSubTree(root.left, root.val) | !isValidSubTree(root.right, root.val)) {
            return false;
        }

        count++;
        return root.val == value;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(1, new TreeNode(5), new TreeNode(5));
//        root.right = new TreeNode(5, null, new TreeNode(5));

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5, null, null);
        root.right = new TreeNode(5, null, null);

        System.out.println(countUniValueSubtrees(root));
    }
}
