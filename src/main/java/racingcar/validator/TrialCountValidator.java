package racingcar.validator;
//시도 횟수 유효성 검증
public class TrialCountValidator {
    public static void countValidator(String input){
        int number = parseNumber(input);
        validateIsPositive(number);
    }
    private static int parseNumber(String input){
        try{
            return Integer.parseInt(input);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
    private  static void validateIsPositive(int num){
        if(num <= 0){
            throw new IllegalArgumentException("시도 횟수는 0보다 커야 합니다.");
        }
    }

}
