package model;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class inputModel {
    public static String setQuiz(String quesNumber, int isClose) {
        if(isClose == 1) {
            String question = Integer.toString(Randoms.pickNumberInRange(1, 9) * 100
                    + Randoms.pickNumberInRange(1, 9) * 10 + Randoms.pickNumberInRange(1, 9));
            return question;
        }
        return quesNumber;
    }
    // 입력 부분 체크로직
    public static String stringInput() {

        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        boolean isCorrect = stringCheck(input);
        if (isCorrect) {
            return input;
        }
        return "";
    }
    public static boolean stringCheck (String input) {
        if (input.length() != 3 || !isNumber(input) || !isNotDuplicated(input)) {
            throw new IllegalArgumentException("잘못된 문자를 입력하셨습니다.");
        }
        return true;
    }
    // 숫자 존재
    public static boolean isNumber(String input) {
        return input.matches("[1-9]*");
    }
    // 중복 확인
    public static boolean isNotDuplicated(String input) {
        if((input.charAt(0) != input.charAt(1)) && (input.charAt(1) != input.charAt(2))
                && (input.charAt(0) != input.charAt(1))) {
            return true;
        }
        return false;
    }

}
