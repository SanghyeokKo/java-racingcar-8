package racingcar;

import racingcar.controller.RacingController;
//프로그램 시작
public class Application {
    public static void main(String[] args){
        RacingController racingController = new RacingController();
        racingController.run();
    }
}
