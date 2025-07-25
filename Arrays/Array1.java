package Arrays;
// 1.Write a program to accept N values into an integer Sample.array and display the contents


import java.util.*;
public class Array1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        //int[] arr1 = new int[n];
        /*for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }*/

//2.Write a program to accept N values into an integer Sample.array and display in the reverse order.
        /*for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=n-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }*/

//3. Write a  program to print the count of the elements in an Sample.array whose values are lesser than a key element in an unsorted Sample.array.
        /*for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the key Element : ");
        int key = scan.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]<=key){
                count++;
            }
        }
        System.out.println(count);*/

//4.Write a program to find minimum of the Sample.array .

        /*for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);*/

//5.Write a program to find sum of the Sample.array

        /*for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);*/

//6.Write a program to search an element in the given Sample.array and print the searched elements index. If no such elements were found print -1
        /*for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int element = scan.nextInt();
        int index =-1;
        for(int i=0;i<n;i++) {
            if(element == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);*/

//7.You are given an Sample.array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the Sample.array .
//Input Sample.array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
//Output Sample.array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

        /*for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for (int j=0;j<n;j++){
            if(j<count){
                arr[j]=0;
            }
            else {
                arr[j]=1;
            }
        }
        System.out.println(Arrays.toString(arr));*/

//8.Write a program  to replace the Sample.array elements with sum of other elements.

        /*for(int i =0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=0;i<n;i++){
            arr[i]=sum-arr[i];
        }
        System.out.println(Arrays.toString(arr));*/


//9.Write a program  to insert the value at given position in the Sample.array.

        System.out.print("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int arr1[] = new int[n+1];
        System.out.print("Enter the value");
        int value = scan.nextInt();
        System.out.print("Enter the pos ");
        int pos = scan.nextInt();

        for(int i=0;i<pos;i++){
            arr1[i]=arr[i];
        }
        arr1[pos]= value;
        for(int i=pos+1;i<=n;i++){
            arr1[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(arr1));
//10.Write a program  to delete the value at given position from the Sample.array.

        /*int arr1[] = new int[n-1];
        System.out.print("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        //System.out.print("Enter the value");
        //int value = scan.nextInt();
        System.out.print("Enter the pos ");
        int pos = scan.nextInt();
        for(int i=0;i<pos;i++){
            arr1[i]=arr[i];
        }
        //arr1[pos]= value;
        for(int i=pos;i<n-1;i++){
            arr1[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));*/

//add the Sample.array elements with other elements
        /*for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++) {
            a = a+arr[i];
        }
        for(int j=0;j<n;j++){
            a=a-arr[j];
            arr[j]=a;
            //System.out.println(a);
            }

       System.out.println(Arrays.toString(arr));*/

    }
}

