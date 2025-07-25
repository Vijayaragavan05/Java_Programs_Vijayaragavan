package Training;
import java.util.Scanner;
public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no.of Students");
        int n = scan.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Attendance of the Student "+ (i+1) + ":\n");
            arr[i]=scan.next().charAt(0);
        }
        int present = 0;
        int Absent = 0;
        for(int i=0;i<n;i++) {
            if (arr[i] == 'P') {

                present++;
            } else {
                Absent++;
            }
        }
        System.out.println("Today Attendance List: \n");
        for(int i=0;i<n;i++){
            if(arr[i] == 'P'){
                System.out.println("Student "+ (i+1) + " Present");
            }
            else {
                System.out.println("Student "+ (i+1) + " Absent");
            }
        }

    }
}
