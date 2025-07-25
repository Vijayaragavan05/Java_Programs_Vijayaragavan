package DSA;

public class DLL {
    Node start=null;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
    public void insertBeg(int val){
        Node newNode = new Node(val);
        if(start==null){
            start=newNode;
        }
        else{
            newNode.next=start;
            start.prev=newNode;
            start=newNode;
        }
    }
    public void insertEnd(int val1){
        Node newNode = new Node(val1);
        if (start == null){
            start=newNode;
        }
        else{
            Node tpr =start;
            while(tpr.next!=null) {
                tpr=tpr.next;
            }
            tpr.next=newNode;
            newNode.prev=tpr;
        }
    }
    public void insertPos(int pos,int value){
        Node newNode = new Node(value);
        Node tpr = start;
        if(pos==1){
            insertBeg(value);
        }
        else{
           for(int i=1;i<pos-1;i++) {
               tpr = tpr.next;
           }
            tpr.next.prev=newNode;
            newNode.prev=tpr;
            newNode.next=tpr.next;
            tpr.next=newNode;
          }
    }
    public void delBeg(){
        if(start==null){
            System.out.println("List is empty");
        }
        else {
            start.next.prev = null;
            start = start.next;
        }
    }
    public void delEnd(){
        Node tpr=start;
        if(start==null){
            System.out.println("List is Empty");
        }
        else{
            while (tpr.next!=null){
                tpr=tpr.next;
            }
            tpr.prev.next=null;
        }
    }
    public void delPos(int pos){
        Node tpr=start;
        if(pos==1){
            delBeg();
        }
        else {
            for(int i=1;i<pos-1;i++){
                tpr=tpr.next;
            }
            tpr.next.next.prev=tpr;
            tpr.next=tpr.next.next;
          }
    }
    public void display(){
        Node tpr = start;
        Node end = null;
        System.out.println("Forward");
        while(tpr!=null){
            System.out.print(tpr.data+"->");
            end=tpr;
            tpr=tpr.next;
        }
        System.out.println("null");
        System.out.println("BackWard");
        while(end!=null){
            System.out.print(end.data+"->");
            end=end.prev;
        }
    }
    public static void main(String[] args){
        DLL obj = new DLL();
        obj.insertBeg(10);
        obj.insertBeg(20);
        obj.insertBeg(30);
        obj.display();
        System.out.println();
        obj.insertEnd(35);
        obj.display();
        System.out.println();
        obj.insertPos(2,25);
        obj.display();
//        System.out.println();
//        obj.delBeg();
//        obj.display();
//        System.out.println();
//        obj.delEnd();
//        obj.display();
        System.out.println();
        obj.delPos(3);
        obj.display();
    }
}
