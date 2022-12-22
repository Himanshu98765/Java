import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReader{
    public static void main(String[] args) throws IOException {
       // try(
       InputStreamReader ir=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir); 
            String name = br.readLine();
            System.out.println("Your Name is: " + name);
        
    }
}