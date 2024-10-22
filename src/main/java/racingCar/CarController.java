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
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            Car car = new Car(input);

            nameList = car.getNameList();
            ArrayList<ArrayList<String>> list = new ArrayList<>();

            for (int i = 0 ; i<nameList.size();i++) {
                ArrayList<String> listt = new ArrayList<>();
                list.add(listt);
            }

            int countNumber = view.tryCount(sc);

            view.racingMapResult(countNumber,nameList,list);

            view.finalRewardView(nameList,list);
            break;
        }
        // TODO 구현 진행
    }
}
