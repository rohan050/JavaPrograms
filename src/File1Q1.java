//Write a java program to read/write data into the file.(Use File Output Stream, File Input
//Stream).
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;

class File1Q1 {
    public static void main(String []args)throws IOException{
        try {
            FileOutputStream os = new FileOutputStream("D:/Assignments/File1.txt");
            String a = "Golmaal";
            byte b[]=a.getBytes();
            os.write(b);
            os.close();
            System.out.println("Successful");
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            FileInputStream is =new FileInputStream("D:/Assignments/File1.txt");
            int d;
            while ((d=is.read())!=-1){
                System.out.print((char) d);
            }
            is.close();
        }
        catch(Exception a){
            System.out.println(a);
        }
    }
}
