package tree;

public class TreePathSumWithRecursion {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
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
