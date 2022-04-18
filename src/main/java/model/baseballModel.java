package model;
import vo.baseballVO;


public class baseballModel {

    // 입력 부분 (로직 수행 전)
    public static baseballVO Solution(String question, String input) {
        int strike = 0, ball = 0;
        baseballVO res = new baseballVO();
        for(int i = 0; i < input.length(); i++) {
            strike += Strike(question.charAt(i), input.charAt(i));
            ball += Ball(question, input.charAt(i), i);
        }
        res.setStrike(strike);
        res.setBall(ball);
        return res;
    }

    // 스트라이크 개수 판별
    public static int Strike(char que, char in) {
        if(que == in) {
            return 1;
        }
        return 0;
    }
    // 볼 개수 판별
    public static int Ball(String que, char in, int num) {
        if((que.indexOf(in) >= 0) &&(que.indexOf(in) != num)) {
            return 1;
        }
        return 0;
    }

}
