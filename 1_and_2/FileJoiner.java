import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

class FileJoiner {
    public static void main(String[] args) throws IOException 
    {
        int i = 1;
        while(true) 
        {
            try(FileInputStream fis = new FileInputStream("outputfiles1/output" + i + ".txt");) 
            {
                byte[] b = new byte[fis.available()];
                fis.read(b);
                try(FileOutputStream fos = new FileOutputStream(new File("finaloutput.txt"), true);) 
                {
                    fos.write(b);
                }
            }
            catch(IOException a) {
                System.out.println(a);
                System.out.println("all the files are read and compiled into one file");
                break;
            }
            ++i;
        }
        System.out.println("the program successfully exited");
    }
}