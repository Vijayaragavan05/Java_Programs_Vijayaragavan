package DSA;

public class Cll {
    Node last = null;

    class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public void insertbeg(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            newnode.next = newnode;
            last = newnode;
        } else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }

    public void insertend(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            newnode.next = newnode;
            last = newnode;
        } else {
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }

    public void delBeg() {
        if (last == null) {
            System.out.println("list is empty");
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }
    public void delEnd(){
        if(last==null){
            System.out.println("list is empty");
        }
        if(last.next==last){
            last=null;
        }
        else {
            Node tpr =last.next;
            while (tpr!=last){
                tpr=tpr.next;
            }
            tpr.next=last.next;
            last=tpr;
        }

    }
    public void display() {
        Node tpr = last.next;
        do {
            System.out.print(tpr.data + " -> ");
            tpr = tpr.next;
        }
        while (tpr != last.next);
    }

    public static void main(String[] args){
       Cll obj = new Cll();
       obj.insertbeg(10);
       obj.insertbeg(20);
       obj.insertbeg(30);
       obj.display();
        System.out.println();
        obj.insertend(40);
        obj.display();
        System.out.println();
        obj.delBeg();
        obj.display();
        System.out.println();
        obj.delEnd();
        obj.display();
    }
}
