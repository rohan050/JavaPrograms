//6. Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how
//much time it will take to upload the file on server if internet speed is 256 bps(bitsper
import java.io.*;
import java.io.File;
import java.io.IOException;

class Image{
    public static void main(String []args)throws IOException {
        String path = "D:/Assignments/Image.jpg";
        int bps=256;

        File f=new File(path);
        if(!f.exists()){
            System.err.println("File does not exist");
        }
        try{
            long inbytes= f.length();
            System.out.println("Total number of Bytes in File: "+inbytes+" Bytes");
            double inbits = inbytes*8;
            double time =inbits/(double)bps;
            System.out.println("This image file will take "+time+" seconds to upload.");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
