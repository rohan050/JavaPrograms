//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
class SMQ4 {
    public static void main(String []args){
        ArrayList obj=new ArrayList();
        obj.add("Rahul");
        obj.add("Vinay");
        obj.add("Subodh");
        obj.add("Raveena");
        System.out.println(obj.get(2));
    }
}
