package racingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private List<String> nameList;


    public Car(String input) {
        this.nameList = new ArrayList<>();
        splitInput(input);
    }

    private void splitInput(String input) {
        if (input!=null && !input.isEmpty()) {
            this.nameList = new ArrayList<>(Arrays.asList(input.split(",")));
        }
    }

    public List<String> getNameList() {
        return this.nameList;
    }


}
