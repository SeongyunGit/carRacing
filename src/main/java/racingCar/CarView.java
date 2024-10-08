package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarView {
    private static CarModel model;

    public CarView (CarModel model) {
        CarView.model = model;
    }


    public void finalRewardView(List<String> nameList, ArrayList<ArrayList<String>> list) {
        System.out.print("최종 우승자 : ");
        int maxBar = 0;
        for (int i = 0; i< nameList.size() ; i++) {
            if (maxBar < list.get(i).size()) {
                maxBar = list.get(i).size();
            };
        }

        List<String> winner = new ArrayList<>();
        for (int i =0 ; i< nameList.size(); i++) {
            if (maxBar == list.get(i).size()) {
                winner.add(nameList.get(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< nameList.size() ; i++) {
            if (maxBar == list.get(i).size()) {
                sb.append(nameList.get(i));
                if (i< winner.size()-1) {
                    sb.append(", ");
                }
            }
        }
        System.out.println(sb);
    }

    public void racingMapResult(int countNumber, List<String> nameList, ArrayList<ArrayList<String>> list) {
        System.out.println("실행 결과");
        for (int i=0;i<countNumber;i++) {
            model.sizeNameList(nameList,list);
            System.out.println();
        }
    }

    public static int tryCount(Scanner sc) {
        System.out.println("시도할 회수는 몇회일까요?");
        int countNumber;
        String count = sc.nextLine();
        if (count.matches("-?\\d+")) {
            countNumber = Integer.parseInt(count);
        }
        else {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        System.out.println();
        return countNumber;
    }
}
