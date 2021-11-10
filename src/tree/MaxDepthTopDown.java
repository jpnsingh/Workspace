package tree;

public class MaxDepthTopDown {

    private static int answer;

    private static void maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }

        maxDepth(root.left, depth + 1);
        maxDepth(root.right, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        answer = 0;
        maxDepth(root, 1);
        System.out.println(answer);
    }
}
