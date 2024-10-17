//8. Write a Java program to sort a given array list.

import java.util.ArrayList;

class SMQ8 {
    public static void main(String []args){
        ArrayList<String> obj=new ArrayList();
        obj.add("Gita");
        obj.add("Veena");
        obj.add("Heena");
        obj.add("samay");
        obj.add("Vaishali");
        obj.replaceAll(String::toLowerCase);
        obj.sort(null);
        System.out.println(obj);
    }
}
