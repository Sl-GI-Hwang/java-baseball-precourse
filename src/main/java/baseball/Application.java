package baseball;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anyInt;

// Constraints
// Line : 10
// indent : 1 depth
// else 금지
public class Application {

    // 입력 값 판별
    private static int InputCheck(String question) {
        try {
            int keep = 1;
            String input = Console.readLine();
            return Solution(question, input);
        } catch (IllegalArgumentException e) {
            System.out.print("잘못된 값을 입력하셨습니다.");
            return 0;
        }
    }

    // 입력 부분 (로직 수행 전)
    private static int Solution(String question, String input) {
        int strike = 0, ball = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < question.length(); i++) {
            strike += Strike(question.charAt(i), input.charAt(i));
            ball += Ball(question, input.charAt(i), i);
        }
        res.add(strike);
        res.add(ball);
        return SolvPrint(res);
    }

    // 스트라이크 개수 판별
    private static int Strike(char que, char in) {
        if(que == in) {
            return 1;
        }
        return 0;
    }
    // 볼 개수 판별
    private static int Ball(String que, char in, int num) {
        if((que.indexOf(in) >= 0) &&(que.indexOf(in) != num)) {
            return 1;
        }
        return 0;
    }

    // 분기에 맞는 출력만 담당
    private static int SolvPrint(ArrayList<Integer> in) {
        if((in.get(0) == 0) && (in.get(1) == 0)) {
            System.out.print("낫싱");
        }
        PrintStrike(in.get(0));
        PrintBall(in.get(1));
        System.out.println();

        return ResPrint(in);
    }

    // 스트라이크 갯수 출력
    private static void PrintStrike(int strike) {
        if(strike > 0) {
            System.out.print(strike + "스트라이크");
        }
    }

    // 볼 갯수 출력
    private static void PrintBall(int ball) {
        if(ball > 0) {
            System.out.print(ball + "볼");
        }
    }

    // 결과에 따른 진행여부 결정
    private static int ResPrint(ArrayList<Integer> in) {
        String s = "1";
        if(in.get(0) == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            s = Console.readLine();
        }
        if(s.equals("2")) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        int keep = 1;
        while(keep == 1) {
            String question = Integer.toString(Randoms.pickNumberInRange(anyInt(), anyInt()));
            System.out.print("숫자를 입력해주세요 : ");
            keep = InputCheck(question);
        }
    }

}
