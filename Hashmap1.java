import java.util.*;
public class Hashmap1{
    public static void main(String[]args){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Murali");
        a.put("City","Chennai");
        System.out.println(a);
        //modifying value for akey
        a.put("SNo","90");
        System.out.println(a);
        //removing key in a hashmap
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}