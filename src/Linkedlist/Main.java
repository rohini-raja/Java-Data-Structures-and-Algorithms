package Linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(); //create a new linked list
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
       // list.display(); //displays the linked list
        list.insertLast(5);
        list.insertLast(6);
       // list.display();
        list.insertFirst(23);
       // System.out.print("The final list is" + "\n");
       // list.display();
      //  System.out.println("Inserting at the index 2");
        list.insert(20,2);
        list.display();
        System.out.println("Deleting First");
        System.out.println(list.deleteFirst()); //returns the value of the deleted node
        System.out.println("List after deleting");
        list.display();
        System.out.println("Deleting Last");
        list.deleteLast();
        list.deleteFirst();
        System.out.println("List after deleting");
        list.display();
        System.out.println("Deleting at index 2");
        list.delete(2);
        System.out.println("List after deleting");
        list.display();
        System.out.println("Find the value of 3");
        System.out.println(list.find(3));
    }
}
