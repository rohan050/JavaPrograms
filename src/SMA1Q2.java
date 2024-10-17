import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in an array list
class SMQ2 {
    public static void main(String []args){
        ArrayList obj = new ArrayList();
        obj.add("Souryansh");
        obj.add("Abhishek");
        obj.add("Vinod");
        Iterator v= obj.iterator();
        while (v.hasNext()){
            System.out.println(v.next());
        }
    }
}
