public class MyNode<T extends Comparable<T>> {
    T data;
    MyNode left;
    MyNode right;

    public MyNode(T data) {
        this.data = data;
    }
}
