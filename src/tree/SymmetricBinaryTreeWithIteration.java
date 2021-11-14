package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricBinaryTreeWithIteration {
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node1 = nodeQueue.poll();
            TreeNode node2 = nodeQueue.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            nodeQueue.add(node1.left);
            nodeQueue.add(node2.right);
            nodeQueue.add(node1.right);
            nodeQueue.add(node2.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null));
        root.right = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null));

        System.out.println(isSymmetric(root));
    }
}
