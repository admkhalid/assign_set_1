import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

class IndieStreams {
    public static void main(String[] args) throws IOException{
        for(int i = 0; i < 8; ++i) {
            try(FileOutputStream fos1 = new FileOutputStream(new File("output.txt"), true);) {
                fos1.write("stream1 ".getBytes());
            }
            try(FileOutputStream fos2 = new FileOutputStream(new File("output.txt"), true);) {
                fos2.write("stream2 ".getBytes());
            }
            try(FileOutputStream fos3 = new FileOutputStream(new File("output.txt"), true);) {
                fos3.write("stream3\n".getBytes());
            }
        }
    }
}