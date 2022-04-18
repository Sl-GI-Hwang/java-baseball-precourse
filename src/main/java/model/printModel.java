package model;

import camp.nextstep.edu.missionutils.Console;
import vo.baseballVO;

public class printModel {
    // 분기에 맞는 출력만 담당
    public static int SolvPrint(baseballVO res) {
        if((res.getStrike() == 0) && (res.getBall() == 0)) {
            System.out.print("낫싱");
        }
        PrintBall(res.getBall());
        PrintStrike(res.getStrike());
        System.out.println();
        return ResPrint(res);
    }

    // 스트라이크 갯수 출력
    public static void PrintStrike(int strike) {
        if(strike > 0) {
            System.out.print(strike + "스트라이크");
        }
    }

    // 볼 갯수 출력
    public static void PrintBall(int ball) {
        if(ball > 0) {
            System.out.print(ball + "볼 ");
        }
    }

    // 결과에 따른 진행여부 결정
    private static int ResPrint(baseballVO in) {
        int s = 0;
        if(in.getStrike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String ch = Console.readLine();
            s = Integer.parseInt(ch);
        }
        return s;
    }
}
