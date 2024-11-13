package racingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarList {

    private List<String> nameList;
    private OverName overName = new OverName();
    private boolean inspectionResult;

    public CarList(String input) {
        this.nameList = new ArrayList<>();
        splitInput(input);
    }

    private void splitInput(String input) {
        if (input!=null && !input.isEmpty()) {
            this.nameList = new ArrayList<>(Arrays.asList(input.split(",")));
            inspection(nameList);
        }
    }

    private void inspection(List<String> nameList) {
        for (String name : nameList) {
            try {
                overName.check(name);
            } catch (RuntimeException e) {
                System.out.println("[ERROR]" + e.getMessage());
                inspectionResult = true;
            }
        }
    }

    public List<String> getNameList() {
        return this.nameList;
    }

    public boolean getInspectionResult() {
        return inspectionResult;
    }
}
