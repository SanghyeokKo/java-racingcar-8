# java-racingcar-precourse
# 자동차 경주
## 기능 요구사항
1. 경주할 자동차 이름은 쉼표(,) 기준으로 구분하고 이름은 5자 이하만 가능하다.
2. 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
   - 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
3. 자동차 경주 게임이 완료한 후 우승자를 알려준다.

## 입출력 요구 사항
1. 경주할 자동차 이름을 입력받는다.(5자 이하)
2. 시도할 횟수를 입력받는다.
3. 차수별 실행 결과를 출력한다.
4. 우승자 안내 문구를 출력한다.(한 명 이상일때는 쉼표(,)를 이용하여 구분)
5. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 프로그래밍 요구 사항
1. JDK 21 버전에서 실행 가능해야 한다.
2. 프로그램 실행의 시작점은 Application의 main()이다.
3. build.gradle 파일은 변경할 수 없으며, 제공된 라이브러리 이외의 외부 라이브러리는 사용하지 않는다.
4. 프로그램 종료 시 System.exit()를 호출하지 않는다.
5. 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
6. 자바 코드 컨벤션을 지키면서 프로그래밍한다.(기본적으로 Java Style Guide를 원칙으로 한다.)
7. indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
   - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
   - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
8. 3항 연산자를 쓰지 않는다. 
9. 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라. 
10. JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.
    - 테스트 도구 사용법이 익숙하지 않다면 아래 문서를 참고하여 학습한 후 테스트를 구현한다.
        - JUnit 5 User Guide
        - AssertJ User Guide
        - AssertJ Exception Assertions
        - Guide to JUnit 5 Parameterized Tests
11. camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현해야 한다.
    - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
    - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.