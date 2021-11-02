package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * n l r
 */
public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversedList = new ArrayList<>();
        Queue<TreeNode> levelNodes = new LinkedList<>();

        if (root != null) {
            levelNodes.offer(root);
        }
        TreeNode current;

        while (!levelNodes.isEmpty()) {
            int size = levelNodes.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < size; ++i) {
                current = levelNodes.poll();
                levelValues.add(current.val);
                if (current.left != null) {
                    levelNodes.offer(current.left);
                }
                if (current.right != null) {
                    levelNodes.offer(current.right);
                }
            }
            traversedList.add(levelValues);
        }

        return traversedList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println(levelOrder(root));
    }
}
