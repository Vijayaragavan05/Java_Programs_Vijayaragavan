package DSA;



class Main {
    Node start;
    class Node{
        int data;
        Node next;
        Node(int a){
            data = a;
            next = null;
        }
    }
    public void insert(int val){
        Node newNode = new Node(val);
        newNode.next=start;
        start = newNode;
    }
    public void insertend(int val1){
        Node newNode = new Node(val1);
        Node tptr = start;
        while(tptr.next!=null){
            tptr=tptr.next;
        }
        tptr.next=newNode;
    }
    public void insertpos(int pos,int value){
        Node newNode = new Node(value);
        Node tptr = start;
        if(pos==1){
            insert(value);
        }
        int i=1;
        while(i<pos){
            tptr=tptr.next;
            i++;
        }
        newNode.next=tptr.next;
        tptr.next=newNode;

    }
    public void display() {
        Node tptr = start;
        while (tptr != null) {
            System.out.print(tptr.data + "->");
            tptr = tptr.next;
        }
    }
    public void delbegining(){
        if(start==null){
            System.out.println("List is empty");
            return;
        }
        start=start.next;
    }
    public void delEnd(){
        if(start==null){
            System.out.println("List is empty");
            return;
        }
        if(start.next==null){
            start=null;
            return;
        }
        Node tptr=start;
        while(tptr.next.next!=null){
            tptr=tptr.next;
        }
        tptr.next=null;
    }
    public void delPos(int pos){
        Node tpr=start;
        if(start==null){
            System.out.println("List is Empty");
        }
        if(pos==1){
            delbegining();
        }
        else{
            for(int i=1;i<pos-1;i++){
                tpr=tpr.next;
            }
            tpr.next=tpr.next.next;
        }
    }
    public void reverse(){
        Node tpr = start,temp=null,prev=null;
        while(tpr!=null){
            temp = tpr.next;
            tpr.next=prev;
            prev=tpr;
            tpr=temp;
        }
        start=prev;
    }
}
public class L_list {
    public static void main(String[] args){
        Main obj = new Main();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.display();
        System.out.println();
        obj.insertend(5);
        obj.display();
        System.out.println();
        obj.insertpos(3,40);
        obj.display();
        System.out.println();
        //obj.sum(5);
        //System.out.println(obj.Sum);
//        obj.delbegining();
//        System.out.println();
//        obj.display();
//        obj.delEnd();
//        System.out.println();
        obj.display();
        obj.reverse();
        System.out.println();
        obj.display();
        System.out.println();
        obj.delPos(2);
        obj.display();
    }
}
