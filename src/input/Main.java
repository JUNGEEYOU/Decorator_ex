package input;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    int c;
    try {
        InputStream in2 =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src\\input\\test.txt")));
        while((c = in2.read()) >= 0) {
            System.out.print((char)c);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}