package binary_search_tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(7);
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(6);
        binaryTree.insert(5);
        binaryTree.insert(8);

        System.out.println("printing in order");
        binaryTree.inorder(binaryTree.head);

        System.out.println("printing pre order");// 2 1 7 4 3 6 5 8 
        binaryTree.prenorder(binaryTree.head);

        System.out.println("printing post order"); //1 3 5 6 4 8 7 2
        binaryTree.postorder(binaryTree.head);
    }


}
