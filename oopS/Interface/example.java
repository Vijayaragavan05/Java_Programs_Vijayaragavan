package Training;

import jdk.jshell.spi.ExecutionControl;
//class UserException extends Exception{
//    UserException(String msg){
//        //String msg;
//        super(msg);
//    }
//}
public class example extends Exception {


    public static void main(String[] args) throws Exception {
        try{
           int n= 10/0;
           throw new Exception("Cannot divide by zero");

        }
        catch (Exception e){
            System.out.println("this value -- "+e);
        }
    }
}
