package Data_Structure;

public class subset {
    public static void main(String args[]){
        String str = "abdc";
        String max ="";
        for(int i=0;i<str.length();i++){
            String sub = str.substring(i);
            if(sub.compareTo(max)>0){
                max=sub;
            }
        }
        System.out.println(max);
    }
}
