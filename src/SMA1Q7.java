//7. Write a Java program to search for an element in an array list.
import java.util.ArrayList;

class SMQ7 {
    public static void main(String []args){
        ArrayList obj = new ArrayList();
        obj.add("Sushil");
        obj.add("Virendra");
        obj.add("Sunil");
        obj.add("Ram");
        obj.add("Sanam");
        boolean s= obj.contains("Ram");
        if(s==true){
            System.out.println(obj.indexOf("Ram"));
        }
    }
}
