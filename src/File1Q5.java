//5. Write a program to count no of words in a text file and average word size.
import java.io.*;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.BufferedReader;
class Words{
    public static void main(String []args)throws IOException{
        try{
            BufferedWriter oout = new BufferedWriter(new FileWriter("D:/Assignments/File5.txt"));
            String s= "Hello Welcome to sajjanpur. There lives one man named as Javalang";
            oout.write(s);
            oout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
        BufferedReader fout=new BufferedReader(new FileReader("D:/Assignments/File5.txt"));
        String w;
        int words =0;
        double ch=0;
        while((w = fout.readLine()) != null) {
            String word[] = w.split(" ");
            words = words + word.length;
            for(String c : word){
                ch+=c.length();
            }
        }
        fout.close();
        System.out.println("The Total number of words are: "+words);
        double avg=ch/words;

        System.out.println("The Average Characters in each words are: "+avg);
    }
}
