//What is Serialization ? Write a java program to store the object into the file.
//Serialization is a mechanism of writing a state of object into a
// byte stream.The process of Serialzation is platform independent, it means you can
// run that serialized program on different platform.
import java.io.Serializable;
import java.io.*;
class Dmart implements Serializable{
    private String pname;
    private int price;
    public Dmart(String pname, int price){
        this.pname=pname;
        this.price=price;
    }
}
class F{
    public static void main(String []args){
        try {
            Dmart s=new Dmart("Sugar",42);
            FileOutputStream fout=new FileOutputStream("D:/Assignments/File1.txt");
            ObjectOutputStream oout= new ObjectOutputStream(fout);
            oout.writeObject(s);
            oout.close();
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}