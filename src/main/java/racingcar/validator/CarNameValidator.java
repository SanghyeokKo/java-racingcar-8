package racingcar.validator;
//자동차 이름 유효성 검증
public class CarNameValidator {
    private static final int MAX_NAME_LENGTH = 5;
    private static final String COMMA = ",";
    public static void nameValidate(String input){
        String[] names = splitInput(input);
        validateNames(names);
    }
    private static String[] splitInput(String input){
        return input.split(COMMA,-1);
    }
    private static void validateNames(String[] names){
        for(String name : names){
            if(name == null || name.trim().isEmpty()){
                throw new IllegalArgumentException("자동차 이름은 비어있거나 공백일 수 없습니다.");
            }
            else if(name.length() > MAX_NAME_LENGTH){
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }
}
