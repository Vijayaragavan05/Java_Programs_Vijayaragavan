package pattern;

import java.util.Scanner;

public class AlphabaticPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /*for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/


       /* for(int i = 0;i<=n;i++){
            char ch = 'A';
            for(int j = 0; j<=n;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }*/

        /*char ch = 'A';
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }*/

        /*for(int i = 1;i<=n;i++) {
            for (int j = 1; j <=n; j++) {
                if ( i == n || i== 1|| j == n||j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        /*for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                if(j==1 ||i==n || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++) {
                if(i==j || i+j==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++) {
                if(i==j || i+j==n+1){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*for(int i = 1;i<=n;i++){
            int m=i;
            for(int j = 1; j<=i;j++){
                System.out.print(m--);
            }
            System.out.println();
        }*/

        /*for(int i = n;i>=1;i--){
            int m=1;
            for(int j = 1; j<=i;j++){
                System.out.print(m++);
            }
            System.out.println();
        }*/

        /*for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                if(j%2==0){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }*/

        /* this is the one method

        for(int i = 1;i<n*2;i++){

            for(int j = 1; j<n*2;j++){
                int m=i;
                int k =1;
                if(i==(n*2)-1|| j==(n*2)-1||i==1||j==1){
                    System.out.print("1");
                }
                else if(i==(n*2)-2|| j==(n*2)-2||i==2||j==2){
                    System.out.print("2");
                }
                else if(i==(n*2)-3|| j==(n*2)-3||i==3||j==3){
                    System.out.print("3");
                }
                else if(i==(n*2)-4|| j==(n*2)-4||i==4||j==4){
                    System.out.print("4");
                }
                else{
                    System.out.print(m++);
                }
            }
            System.out.println();
        }*/


        /*for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j < n * 2; j++) {
                int value = Math.min(Math.min(i, j), Math.min((n * 2) - i, (n * 2) - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }*/


        /*for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row;col++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print("*");
            System.out.println();
        }
        for(int row=n-1;row>0;row--)
        {
            for(int col=1;col<=n-row;col++)
                System.out.print(" ");
            for(int col=1;col<=2*row-1;col++)
                System.out.print("*");
            System.out.println();
        }*/
    }
}
