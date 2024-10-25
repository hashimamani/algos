import datastructure.Pair;
import datastructure.TreeNode;


import java.util.*;

public class VerticalOrderTraversal {

    public static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Map to store the nodes along with their horizontal distance from the root
        Map<Integer, List<Integer>> columnTable = new HashMap<>();
        // Queue to perform BFS and store nodes along with their column index
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));

        int minColumn = 0, maxColumn = 0;

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int column = pair.getValue();

            if (!columnTable.containsKey(column)) {
                columnTable.put(column, new ArrayList<>());
            }
            columnTable.get(column).add(node.val);

            if (node.left != null) {
                queue.offer(new Pair<>(node.left, column - 1));
                minColumn = Math.min(minColumn, column - 1);
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, column + 1));
                maxColumn = Math.max(maxColumn, column + 1);
            }
        }

        for (int i = minColumn; i <= maxColumn; i++) {
            result.add(columnTable.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        // Create the tree [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = verticalOrder(root);
        System.out.println(result);  // Output: [[9], [3, 15], [20], [7]]
    }
}
