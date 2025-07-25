package Training;

public class exception {
    public static void main(String[] args) {
        int arr[]={5,10};
        try {
            System.out.println(arr[10]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(arr[0]);
    }
}
