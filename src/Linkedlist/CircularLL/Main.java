package Linkedlist.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL LL = new CLL();
        LL.Insert(2);
        LL.Insert(3);
        LL.Insert(4);
        LL.Insert(5);
        LL.Insert(6);
        LL.Insert(7);
        LL.Insert(8);
        LL.Display();
        LL.delete(7);
        LL.Display();
    }
}
