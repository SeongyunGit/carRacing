package racingCar;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CarModel {
    public void sizeNameList(List<String> nameList, ArrayList<ArrayList<String>> list) {
        for (int j=0;j< nameList.size();j++) {
            int randomNumber = pickNumberInRange(1,9);
            if (randomNumber>=4) {
                list.get(j).add("-");
            }
            String result = String.join("",list.get(j));
            System.out.println(nameList.get(j) + " : " + result);
        }
    }
}
