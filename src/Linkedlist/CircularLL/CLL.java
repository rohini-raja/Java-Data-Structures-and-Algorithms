package Linkedlist.CircularLL;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        int size = 0;
        this.head = null;
        this.tail = null;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void Insert(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
        return;
    }

    public void Display(){
        Node current = head;
        if(head != null){
            do{
                System.out.print(current.value + " -> ");
                current = current.next; //GO TO THE NEXT NODE
            }while(current!=head);
        }
        System.out.println();
    }

    public void delete(int value) {
        Node node = head;
        if(node==null){
            return;
        }
        if(node.value==value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value==value){
                node.next = n.next;
                break;
            }
            node= node.next;
        }while (node!=head);
    }
}

