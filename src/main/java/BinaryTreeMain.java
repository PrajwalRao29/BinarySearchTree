public class BinaryTreeMain {
    public static void main(String[] args) {
        MyBinaryTree b=new MyBinaryTree();
        b.add(56);
        b.add(30);
        b.add(70);
        b.add(22);
        b.add(40);
        b.add(60);
        b.add(95);
        b.add(11);
        b.add(65);
        b.add(3);
        b.add(16);
        b.add(63);
        b.add(67);
        b.display();
        System.out.println("THE SIZE OF THE TREE IS "+b.size());
    }
}
