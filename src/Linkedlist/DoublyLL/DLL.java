package Linkedlist.DoublyLL;

public class DLL {
    private Node head;
    private int size;
    public DLL() {
        int size = 0;
    }
    public void InsertFirst(int val){
        // null = 5 = 3 = 2 = null
        // insert 1 at the beginning
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
        size+=1;
    }

    public void display(){
        Node temp = head;
        Node last  = null;
        while(temp!=null){
            System.out.print(temp.value+" "+ "->");
            last = temp; //this will actually point to the last node
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in Reverse");
        while(last!=null){
            System.out.print(last.value+" "+ "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void InsertLast(int val){
        Node newNode = new Node(val);
        Node last = head;
        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }

        newNode.next = null;
        last.next = newNode;
        newNode.prev = last;

    }
    class Node {
        int value;
        Node prev;
        Node next;
        private int size;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
