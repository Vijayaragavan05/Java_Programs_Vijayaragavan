package oopS;

public class example1 {
    private int no=10;
    public void init(int no){
        this.no=no;
    }
    public int display(){
        return no;
    }
    public static void main(String[] args) {
        example1 ob = new example1();
        ob.init(1001);
        System.out.println(ob.display());
    }
}
