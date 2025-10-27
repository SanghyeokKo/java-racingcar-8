package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
//자동차N대의 상태와 행위
public class Cars {
    private final List<Car> cars;
    public Cars(List<String> carNames){
        this.cars = new ArrayList<>();
        for(String name : carNames){
            Car newcar = new Car(name);
            this.cars.add(newcar);
        }
    }
    public void moveAll(){
        for(Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0,9);
            car.move(randomNumber);
        }
    }
}
