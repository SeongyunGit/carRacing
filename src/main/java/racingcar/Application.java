package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> nameList = Arrays.asList(input.split(","));
        System.out.println("시도할 회수는 몇회일까요?");
        int count = sc.nextInt();
        System.out.println();

        System.out.println("실행 결과");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<count;i++) {
            for (int j=0;j< nameList.size();j++) {
                System.out.println(nameList.get(j) + " : ");
            }
            System.out.println();
        }

        // TODO 구현 진행
    }
}
