import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
class FileReadWriteExample{
    public static void main(String [] args){
        String fileName = "example2.csv";
        File f= new File(fileName);
        try{
            if(f.createNewFile()){
                    System.out.println("File Created");
            }
            else
                System.out.println("File does not Exists");
            PrintWriter b=new PrintWriter(f);
            b.println("Name, Rohan");
            b.print("Class, 12th");
            b.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}