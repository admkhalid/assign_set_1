import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileSeparator {
    public static void main(String[] args) throws IOException{
        try(FileInputStream fis  = new FileInputStream("inputfile/file.txt");) {
            int end = 1000*256;
            byte[] b = new byte[end];
            int curr_file = 1;
            while(fis.read(b) != -1) {
                try(FileOutputStream fos = new FileOutputStream("outputfiles1/output" + curr_file + ".txt");) {
                    fos.write(b);
                }
                curr_file++;
                if(fis.available() < end && fis.available() != 0) {
                    b = new byte[fis.available()];
                }
            }
        }
    }
}