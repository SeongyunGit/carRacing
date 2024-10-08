package racingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarController {
    private final CarView view;

    public CarController(CarView view) {
        this.view = view;
    }

    public void gameStart() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> nameList = Arrays.asList(input.split(","));
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
