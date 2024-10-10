package racingCar;

import java.util.List;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5글자 이하여야 한다.");
        }
        this.name = name;
    }
    // 추가 기능 구현

    public static void nameCountNumber(List<String> nameList) {
        for (String name : nameList) {
            if (name.length()>5) {
                throw new IllegalArgumentException("[ERROR] 이름은 5글자 이하여야 한다.");
            }
        }
    }
}
