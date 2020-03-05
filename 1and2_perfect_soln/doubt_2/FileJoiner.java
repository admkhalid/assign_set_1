import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;

class FileJoiner {
    public static void main(String[] args) throws IOException {
        int i = 1;
        while(i <= 8)
        {
            try(FileInputStream fis = new FileInputStream("input/out" + i + ".txt")) {
                byte[] b = new byte[fis.available()];
                fis.read(b, 0, fis.available());
                // String s = new String(b);
                try(FileOutputStream fos = new FileOutputStream(new File("output/file.txt"), true))
                {
                    fos.write(b);
                }
            }
            ++i;
        }
    }
}