package racingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarController {
    private final CarView view;
    private static List<String> nameList;

    public CarController(CarView view) {
        this.view = view;
    }

    public void gameStart() {

        Scanner sc = new Scanner(System.in);
        CarList carList;

        while (true) {
            System.out.println(Util.gameStartMention);
            String input = sc.nextLine();
            carList = new CarList(input);
            nameList = carList.getNameList();
            if (!carList.getInspectionResult()) break;
        }

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0 ; i<nameList.size();i++) {
            ArrayList<String> listt = new ArrayList<>();
            list.add(listt);
        }

        int countNumber = view.tryCount(sc);

        view.racingMapResult(countNumber,nameList,list);

        view.finalRewardView(nameList,list);


        // TODO 구현 진행
    }
}
