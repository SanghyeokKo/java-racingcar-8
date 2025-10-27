package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.validator.CarNameValidator;
import racingcar.validator.TrialCountValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import java.util.Arrays;
import java.util.List;

//게임 흐름 제어
public class RacingController {
    public void run(){
        Cars cars = setupCars();
        int trialCount = setupTrialCount();
        racing(cars, trialCount);
        showWinners(cars);
    }
    //자동차 이름 입력, 검증, 객체 생성
    private Cars setupCars(){
        String carNameInput = InputView.readCarNames();
        CarNameValidator.nameValidate(carNameInput);
        List<String> carNames = Arrays.asList(carNameInput.split(","));
        return new Cars(carNames);
    }
    //시도 횟수 입력, 검증, 숫자로 변환
    private int setupTrialCount(){
        String trialCountInput = InputView.readTrialCount();
        TrialCountValidator.countValidator(trialCountInput);
        return Integer.parseInt(trialCountInput);
    }
    //시도 횟수만큼 레이싱 실행
    private void racing(Cars cars, int trialCount){
        OutputView.printHeadLine();
        for(int i = 0 ; i < trialCount ; i++){
            cars.moveAll();
            OutputView.printRoundResult(cars.getCars());
        }
    }
    //우승자 출력
    private void showWinners(Cars cars){
        List<String> winners = cars.findWinners();
        OutputView.printWinners(winners);
    }
}
