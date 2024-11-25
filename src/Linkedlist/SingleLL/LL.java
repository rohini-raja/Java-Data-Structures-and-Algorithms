package Linkedlist.SingleLL;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        int size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val); //create a new node
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size+=1; //increase the size of the linked list
    }
    public void insertLast(int val){
        /* My implementation
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size+=1;
    }
         */
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size+=1;
    }
    public void insert(int val,int index){
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size+=1;
    }
    // Insert using Recursion ,useful when given without size or tail variable
    public void insertRec(int value, int index){

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) { //list is empty, so return
            tail = null;
        }
        size-=1;
        return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node SecondLast = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }else if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size-=1;
        return val;
        }

    public Node find(int index) {
        Node node = head;
        while (node != null) {
            if (node.value == index) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " " + "->");
            temp = temp.next;
        }
        System.out.println("End of linked list");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null; //this happens automatically in java?
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        @Override
        public String toString() {
            return String.valueOf(value);  // Returns the node's value as a String
        }
    }


}
