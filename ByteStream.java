import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteStream 
{
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) 
    {
        try 
        {
            byte[] data = {'A','B','C'};
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            inputStream.read(data);

            File nf = new File("newByteVishal.dat");
            FileOutputStream out = new FileOutputStream(nf);
            out.write(data);
            System.out.println("Data has been written Successfully...");
        } 
        
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
