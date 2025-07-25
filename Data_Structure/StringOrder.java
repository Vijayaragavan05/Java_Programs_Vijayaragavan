package Data_Structure;

public class StringOrder {
    public static void main(String args[]){
        //String str = "abcdefghijklmnopqrstuvwxyz";
        String str = "efghijkl";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>str.charAt(i+1)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
