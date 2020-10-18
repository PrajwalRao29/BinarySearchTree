public class MyBinaryTree<T extends Comparable<T>> {

    MyNode root;

    void add(T key) {
        root = add(root, key);
    }

    MyNode add(MyNode root, T key) {

        if (root == null) {
            root = new MyNode(key);
            return root;
        }
        if (root.data.compareTo(key) > 0)
            root.left = add(root.left, key);
        else
            root.right = add(root.right, key);
        return root;
    }
    public int size() {
        return(size(root));
    }
    public int size(MyNode node) {
        if (node == null) return(0);
        else {
            return(size(node.left) + 1 + size(node.right));
        }
    }
    void display() {
        display(root);
    }

    void display(MyNode root) {
        if (root != null) {
            System.out.println(root.data+" --> ");
            display(root.left);
            display(root.right);
        }
        else
        {
            System.out.print("/");
        }
    }

}
