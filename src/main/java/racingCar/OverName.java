package racingCar;

public class OverName {

    public boolean nameCount;
    public OverName() {}

    public void check(String name) throws RuntimeException {
        if (name.length()>5) {
            throw new RuntimeException("오류");
        }
    }
}
