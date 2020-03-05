import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileSeparator {
    public static void main(String[] args) throws IOException{
        try(FileInputStream fis = new FileInputStream("inp.txt");)
        {
            byte[] b = new byte[256*1024]; 
            int curr_file = 1;
            while(fis.read(b, 0, 256*1024) != -1) {
                try(FileOutputStream fos = new FileOutputStream("output/file" + curr_file + ".txt");)
                {
                    // int av = fis.available();
                    // fos.write(b, 0, (av<256*1024)?av:256*1024);
                    fos.write(b);
                }
                ++curr_file;
            }
        }
    }
}