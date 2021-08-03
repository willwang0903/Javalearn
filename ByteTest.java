import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class ByteTest{
    public void copy(InputStream in,OutputStream out)throws IOException{
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        while (len != -1){
            out.write(buf,0,len);
            len = in.read(buf);
        }
    }
    public static void main(String[] args) throws IOException{
        ByteTest t = new ByteTest();
        System.out.println("请输入字符：");
        t.copy(System.in,System.out);
    }
}