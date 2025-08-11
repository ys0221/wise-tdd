package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // experiment1();
            experiment2();
        }
    public static void experiment1() {
        /*
        Scanner sc = new Scanner(System.in); // 키보드 값을 읽어감
        String cmd = sc.nextLine(); // 대기 -> 입력 완료는 사람이 한다(입력 후 enter) -> 이 방식으로는 힘들다(매번 입력하기가 어려움)
        System.out.println("입력한 명령어: " + cmd);
         */

        // 미리 선입력을 해놓는다
        /*
        String input = "aaa";
        Scanner sc = new Scanner(input); //미리 작성한 문자열을 읽어감
        String cmd = sc.nextLine();
        System.out.println("입력한 명령어: " + cmd);

         */

        // 두 개의 값
        // String input = "등록\n너 자신을 알라" -> \n : 줄바꿈
        // 출력값 -> 입력한 명령어: 등록, 너 자신을 알라
        String input = """
                등록
                너 자신을 알라
                """;
        Scanner sc = new Scanner(input);
        // 줄바꿈 시 한 줄씩 출력
        String cmd = sc.nextLine();
        String saying = sc.nextLine();
        System.out.println("입력한 명렁어 " + cmd);
        System.out.println("입력한 명언 " + saying);
    }

    public static void experiment2() {
        System.out.println("안녕하세요"); // System.out : 모니터를 향한 통로(PrintStream 객체) -> 출력값이 모니터로 나옴
        // 백업 -> 원래 콘솔 스트림
        PrintStream originalOut = System.out;
        // 코드상에서 출력 결과를 문자열로 받기
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // 저장소로
        PrintStream printStream = new PrintStream(outputStream); // 모니터에서 내 저장소로 방향 수정
        // 모니터로 출력되는게 아니라 저장소로 저장이 됨
        System.setOut(printStream);
        System.out.println("ㅎㅎ"); // 출력 안 됨
        String outStr = outputStream.toString();
        System.setOut(originalOut); // 이렇게 하면 System.out.println(outStr); 출력
        printStream.close();

        if(outStr.equals("ㅎㅎ")) {
            System.out.println("출력 결과가 일치합니다.");
        } else {
            System.out.println("출력 결과가 일치하지 않습니다.");
        }

        System.out.println(outStr); // (기존) 출력 안 됨 -> System.out 이 byteArray 로 데이터를 보내고 있음
    }



}