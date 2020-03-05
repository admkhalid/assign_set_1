import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileSeparator {
    public static void main(String[] args) throws IOException{
        try(FileInputStream fis = new FileInputStream("inputfile/file.txt");)
        {
            byte[] b = new byte[256*1000]; 
            int curr_file = 1;
            while(fis.read(b, 0, 256*1000) != -1) {
                try(FileOutputStream fos = new FileOutputStream("outputfiles/output" + curr_file + ".txt");)
                {
                    fos.write(b);
                }
                ++curr_file;
            }
        }
    }
}