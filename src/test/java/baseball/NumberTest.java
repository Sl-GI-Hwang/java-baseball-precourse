package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;

public class NumberTest extends NsTest {
    @Test
    void 스트라이크_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("139", "129", "125", "2");
                    assertThat(output()).contains("1스트라이크", "2스트라이크", "3스트라이크", "게임 종료");
                },
                1,2, 5
        );
    }

    @Test
    void 볼_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("145", "217", "247", "724", "2");
                    assertThat(output()).contains("1볼", "2볼", "3볼", "3스트라이크", "게임 종료");
                },
                7, 2, 4
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
