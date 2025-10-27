package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

//결과 출력 담당
public class OutputView {
    private static  final String POSITION_MARK = "-";
    public static void printHeadLine(){
        System.out.println("\n실행 결과");
    }
    public static void printRoundResult(List<Car> cars){
        for(Car car : cars){
            String positionString = PositionToString(car.getPosition());
            System.out.println(car.getName() + " : " + positionString);
        }
        System.out.println();
    }
    private static String PositionToString(int position){
        return POSITION_MARK.repeat(position);
    }
    public static void printWinners(List<String> winnerNames){
        String winners = String.join(",",winnerNames);
        System.out.println("최종 우승자 : " + winners);
    }
}
