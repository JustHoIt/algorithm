package String;

import java.util.Scanner;

public class Main11_1 {
    public String solution(String str) { //KKHSSSSSSE
        String answer = "";
        str += " ";  //str.length()값이되면 비교할 i+1이 없어서 오류가 생겨서 임시로 생성하기
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main11_1 T = new Main11_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));


    }
}