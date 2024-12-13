import java.util.*;
public class containsmethodusinghashmap{
    public static void main(String[]args){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Muraja");
        a.put("City","Chennai");
        //printing hashmap key value
        if(a.containsKey("SName")){
            String d=a.get("SName");
        System.out.println(a);
        System.out.println(d);
        }
    }
}