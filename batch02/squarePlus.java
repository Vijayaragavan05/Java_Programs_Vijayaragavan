package batch02;

public class squarePlus {
    public static void main(String[] args) {
        int n = 10;
        String sq = String.valueOf(n*n);
        int count =String.valueOf(sq).length();
        if(count%2!=0){
            int f =Integer.parseInt(sq.substring(0,(count/2)+1));
            int s = Integer.parseInt(sq.substring((count/2)+1),(count/2)+2);
        }
    }
}
