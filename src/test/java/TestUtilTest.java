import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {

    @Test
    @DisplayName("TestUtil.genScanner()")
    void t1() {

        Scanner sc = TestUtil.genScanner("""
                등록
                너 자신을 알라
                소크라테스
                """
        );

        String cmd = sc.nextLine(); // 등록
        String saying = sc.nextLine(); // 너 자신을 알라
        String author = sc.nextLine(); // 소크라테스

        assertThat(cmd).isEqualTo("등록");
        assertThat(saying).isEqualTo("너 자신을 알라");
        assertThat(author).isEqualTo("소크라테스");

    }

    @Test
    @DisplayName("TestUtil.genScanner()")
    void t2() {

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        System.out.println("1 / 이순신 / 나의 죽음을 적에게 알리지 마라"); // 출력하면 out에 쌓임
        String outStr = outputStream.toString();
        assertThat(outStr).isEqualTo("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");
        System.out.println("이제 화면에 출력됩니다.");
        // outputStream 다 썼으면 원상복구
        TestUtil.clearSetOutToByteArray(outputStream);
        assertThat(outStr).isEqualTo("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");
    }

}
