package baseball;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Vector;

// Constraints
// Line : 10
// indent : 1 depth
// else 금지
public class Application {

    // 입력 부분 (로직 수행 전)
    private static int Solution(String question, String input) {
        int strike = 0, ball = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < question.length(); i++) {
            strike += Strike(question.charAt(i), input.charAt(i));
            ball += Ball(question.charAt(i), input.charAt(i));
        }
        res.add(strike);
        res.add(ball);
        return 0; // 출력부 만들기 전 임시로직
    }

    // 스트라이크 개수 판별
    private static int Strike(char que, char in) {
        return 0;
    }
    // 볼 개수 판별
    private static int Ball(char que, char in) {
        return 0;
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        int keep = 1;

        while(keep == 1) {
            String question = Integer.toString(Randoms.pickNumberInRange(100, 1000));
            System.out.print("숫자를 입력해주세요 : ");
            String input = Console.readLine();

            keep = Solution(question, input);

        }

    }


}
