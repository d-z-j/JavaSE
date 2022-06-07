package P58;

public class Main {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("A");
        root.left = new TreeNode<>("B");
        root.right = new TreeNode<>("E");
        root.left.left = new TreeNode<>("C");
        root.left.right = new TreeNode<>("D");
        root.right.right = new TreeNode<>("F");
        test(root);
    }
    //后序遍历
    private static void test(TreeNode<String> root) {
        if (root == null) return;;
        test(root.left);
        test(root.right);
        System.out.print(root.e + " ");
    }
    //中序遍历
    /**private static void test(TreeNode<String> root) {
        if (root == null) return;;
        test(root.left);
        System.out.print(root.e + " ");
        test(root.right);
    }**/
    //先序遍历
    /**private static void test(TreeNode<String> root){
        if (root == null) return;;
        System.out.print(root.e + " ");
        test(root.left);
        test(root.right);
    }**/
}
