package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> nameList = Arrays.asList(input.split(","));
        ArrayList<ArrayList<String>> list = new ArrayList<>();


        for (int i = 0 ; i<nameList.size();i++) {
            ArrayList<String> listt = new ArrayList<>();
            list.add(listt);
        }
        System.out.println("시도할 회수는 몇회일까요?");
        int count = sc.nextInt();
        System.out.println();



        System.out.println("실행 결과");
        for (int i=0;i<count;i++) {
            for (int j=0;j< nameList.size();j++) {
                int randomNumber = pickNumberInRange(1,9);
                if (randomNumber>=4) {
                    list.get(j).add("-");
                }
                String result = String.join("",list.get(j));
                System.out.println(nameList.get(j) + " : " + result);
            }
            System.out.println();
        }
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

        // TODO 구현 진행
    }
}
