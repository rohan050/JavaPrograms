//8. Write a program to read data from shopping.dat file creted in above problem and find
//total money
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

class I{
    public static void main(String []args)throws FileNotFoundException{
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:/Assignments/File7.dat"));
            Shopping b =(Shopping) oin.readObject();
            System.out.println("Product Name: "+b.itemName);
            System.out.println("Product Price: "+b.price);
            System.out.println("Product Quantity: "+b.quantity);
            oin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
