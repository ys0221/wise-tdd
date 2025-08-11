package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            experiment1();
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
        System.out.println("입력한 명렁어" + cmd);
        System.out.println("입력한 명언" + saying);
    }



}