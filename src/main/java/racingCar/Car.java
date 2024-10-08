package racingCar;

import java.util.List;

public class Car {
//    private final String name;
//    private int position = 0;
//
//    public Car() {
//        this.name = name;
//    }
    // 추가 기능 구현
    public boolean nameCountNumber(List<String> nameList) {
        for (int i=0;i< nameList.size();i++) {
            if (nameList.get(i).length()>5) {
                throw new IllegalArgumentException("[ERROR] 이름은 5글자 이하여야 한다.");
            }
        }
        return true;
    }
}
