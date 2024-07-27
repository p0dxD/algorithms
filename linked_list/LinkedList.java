package linked_list;

public class LinkedList {

    Node<String> head;

    class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertStart(String test) {
        if (head == null) {
            head = new Node<String>(test);
        } else {
            Node<String> tmp = head;
            head = new Node<String>(test);
            head.next = tmp;
        }
    }

    private void insertEndHelper(Node<String> head, String test) {
        if(head.next == null) {
            head.next = new Node<String>(test);
        } else {
            insertEndHelper(head.next, test);
        }
    }

    private void printListHelper(Node<String> head) {
        if (head == null) {
            return;
        } else {
            System.out.println("The data: " + head.data);
            printListHelper(head.next);
        }
    }

    private Node<String> deleteHelper(Node<String> head, String item) {
        if (head == null || head.next == null) {
            return null;
        } else if (head.next.data.equals(item)) {
            return head;
        } else {
            return deleteHelper(head.next, item);
        }
    }

    public void delete(String item) {
        //nothing in head
        if (head == null) {
            return;
        }

        //its the head object
        if(head.data.equals(item)) {
            head = head.next;
        } else {
            Node<String> predecesor = deleteHelper(head, item);
            if (predecesor != null && predecesor.next != null) {
                predecesor.next = predecesor.next.next;   
            }
        }
    }

    public void deleteStart(){
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void printList() {
        printListHelper(head);
    }

    public void insertEnd(String test) {
        insertEndHelper(head, test);
    }
}
