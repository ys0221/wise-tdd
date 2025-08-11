import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestUtil {
    public static Scanner genScanner(String input) {
        return new Scanner(input);
    }

    // System.out의 출력을 스트림으로 받기
    public static ByteArrayOutputStream setOutToByteArray() {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        return output;
    }
}
