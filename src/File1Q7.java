//7. Write a program to store your shopping details in a binary file(shopping.dat) with
//information itemName, price, quantity. (Use ObjectOutputStream to store Item class
//object).

import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
class Shopping implements Serializable{
    String itemName ;
    double price;
    int quantity;
    public Shopping(String itemName, double price, int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
}
class H{
    public static void main(String []args)throws IOException {
        Shopping s= new Shopping("Santoor",45,2);
        try{
            ObjectOutputStream oout= new ObjectOutputStream(new FileOutputStream("D:/Assignments/File7.dat"));
            oout.writeObject(s);
            oout.close();
            System.out.println("Success");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
