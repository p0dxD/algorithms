package binary_search_tree;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public void prenorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            prenorder(root.left);
            prenorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
    public void insert(int data) {

        if (head == null) {
            head = new Node(data);
            return;
        }

        insertNode(head, data);
    }

    private void insertNode(Node root, int data) {
        if (data <= root.data) {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                insertNode(root.left, data);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                insertNode(root.right, data);
            }
        }
    }
}
