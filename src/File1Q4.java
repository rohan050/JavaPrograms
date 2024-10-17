//Write a program to count how many times character ‘t’ occurs in a file.
import java.io.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
class Character {
    public static void main(String []args)throws IOException {
        try {
           ;
            BufferedOutputStream bout = new BufferedOutputStream( new FileOutputStream("D:/Assignments/File2.txt"));
            String s="Hello! Welcome to java";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();

            System.out.println("Success");
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("D:/Assignments/File2.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            char ch = 't';
            int count = 0;
            while ((i = bin.read()) != -1) {
                if (ch == (char) i) {
                    count++;
                }
            }
            bin.close();
            fin.close();

            System.out.println("'t' Occurs " + count + " times in File");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
