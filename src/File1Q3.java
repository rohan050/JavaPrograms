//Explain transient keyword in java with example.

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Clothes implements Serializable {
    transient String name;
    int price;
    public Clothes(String name, int price){
        this.name=name;
        this.price=price;
    }
}
class Dress{
    public static void main(String []args)throws IOException {
        Clothes c=new Clothes("Zara",2200);
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:/Assignments/File3.txt"));
        out.writeObject(c);
        out.close();
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:/Assignments/File3.txt"));
            Clothes obj = (Clothes) oin.readObject();
            System.out.println("Product Name: "+obj.name+" Price: "+obj.price);
            oin.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}