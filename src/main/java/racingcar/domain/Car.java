package racingcar.domain;
//자동차 1대의 상태와 행위
public class Car {
    private String name;
    private int position;
    public Car(String name){
        this.name = name;
        this.position = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getPosition(){
        return this.position;
    }
    public void move(int number){
        if(number >= 4)
            this.position++;
    }
}
