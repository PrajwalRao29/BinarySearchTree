import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
        System.out.println("Enter the element you want to search");
        int data=sc.nextInt();
        if(b.search(data))
        {
            System.out.println("Search Successful");
        }
        else
        {
            System.out.println("Search Not Successful");
        }
    }
}
