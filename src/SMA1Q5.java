import java.util.ArrayList;

//5. Write a Java program to update an array element by the given element.
class SMQ5 {
    public static void main(String []args){
        ArrayList n=new ArrayList();
        n.add("Sachin");
        n.add("Sumit");
        n.add("Naresh");
        n.add("Suresh");
        System.out.println(n);
        n.set(2,"Firoz");
        n.set(0,"Vilas");
        System.out.println(n);
    }
}
