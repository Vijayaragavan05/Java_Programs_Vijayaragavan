package pattern;
import java.util.*;
public class numericReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m =0;
        for(int i =1;i<=n;i++){
            if(i%2==1){
                for (int j=m+1;j<=m+n;j++){
                    System.out.print(j+" ");
                }
                m+=2*n;
            }
            else {
                for (int j=m;j>m-n;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
