package linked_list;

public class LinkedListTest {
    
    public static void main(String[] args) throws Exception{

               /* Start with the empty list. */
        LinkedList list = new LinkedList(); 

        // 
        // ******INSERTION****** 
        // 
    
        // Insert the values 
        list.insertStart("test"); 
        list.insertStart("test1"); 
        list.insertStart("test2"); 
        list.insertEnd("test3"); 
        
        // list = insert(list, 3); 
        // list = insert(list, 4); 
        // list = insert(list, 5); 
        // list = insert(list, 6); 
        // list = insert(list, 7); 
        // list = insert(list, 8); 
    
        // Print the LinkedList 
        list.printList(); 

        System.out.println("Deleting items.");

        list.delete("test");
        list.delete("test2");
        list.delete("test3");
        list.delete("test4");

        list.printList(); 

        System.out.println("Adding items.");
        // Insert the values 
        list.insertStart("test4"); 
        list.insertStart("test3"); 
        list.insertStart("test2"); 
        list.insertEnd("test1"); 

        list.printList();

        System.out.println("Deleting other items.");

        list.deleteStart();

        list.printList();

    }
}