package Linkedlist.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.InsertFirst(2);
        dll.InsertFirst(3);
        dll.InsertFirst(4);
        dll.InsertFirst(5);
        dll.display();
        dll.InsertLast(6);
        dll.InsertLast(7);
        dll.display();
    }
}
