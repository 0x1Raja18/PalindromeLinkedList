public class SearchInABinarySearchTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        }

        return searchBST(root.right, val);
    }

    public static void preorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        TreeNode ans = searchBST(root, val);

        System.out.println("Input:");
        System.out.println("Tree = [4,2,7,1,3]");
        System.out.println("Search Value = " + val);

        System.out.println("\nOutput:");

        if (ans != null) {
            preorder(ans);
        } else {
            System.out.println("null");
        }
    }
}