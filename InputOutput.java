
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) throws IOException{
        FileInputStream sourceStream = null;
        FileOutputStream targStream = null;

        try {
            sourceStream = new FileInputStream("A:\\Java\\test.txt");
            targStream = new FileOutputStream("target.txt");

            int temp;
            while((temp = sourceStream.read()) != -1)
            targStream.write((byte)temp);
        }
        finally{
            if(sourceStream != null)sourceStream.close();
            if(targStream != null)targStream.close();
        }
    }
}
