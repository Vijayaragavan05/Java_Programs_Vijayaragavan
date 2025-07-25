package Training;

import jdk.jshell.spi.ExecutionControl;
class UserException extends Exception{
    UserException(String msg){
        //String msg;
        super(msg);
    }
}
public class exception1 {
    static void print(int a) throws UserException {
        if(a<50){
            throw new UserException("Less mark");
        }
        else{
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        try{
            print(55);
            print(40);
        }
        catch (Exception e){
            System.out.println("this value -- "+e);
        }
    }
}
