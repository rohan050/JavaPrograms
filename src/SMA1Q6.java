//6. Write a Java program to remove the third element from an array list.

import com.sun.corba.se.spi.activation.BadServerDefinition;

import java.util.ArrayList;

class SMQ6 {
    public static void main(String []args){
        ArrayList v=new ArrayList();
        v.add("Sita");
        v.add("Brijesh");
        v.add("Somesh");
        v.add("Shailendra");
        v.add("Narendra");
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
    }
}
