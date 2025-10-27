package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    public int returnRandomNumber(){
        int randomNumber = Randoms.pickNumberInRange(0,9);
        return randomNumber;
    }
}
