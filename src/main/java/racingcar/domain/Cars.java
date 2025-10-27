package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.AbstractAtomicReferenceAssert;

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
    public List<Car> getCars(){
        return cars;
    }
    private int findMaxPosition(){
        int maxPosition = 0;
        for(Car car : cars){
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }
    public List<String> findWinners(){
        int maxPosition = findMaxPosition();
        List<String> winnerNames = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == maxPosition){
                winnerNames.add(car.getName());
            }
        }
        return winnerNames;
    }
}
