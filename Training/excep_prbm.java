package Training;

public class excep_prbm {
    public static void main(String[] args) {
        int x=0;
        int arr[] = {5,10};
        try{
            int y =25/x;
            arr[0]=arr[1]/arr[0]-5;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot div by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bound");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("X :"+arr[0] );
    }
}
