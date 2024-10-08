package racingCar;

public class Application {
    public static void main(String[] args) {
        CarModel model = new CarModel();
        CarView view = new CarView(model);
        CarController controller = new CarController(view);
        controller.gameStart();
    }
}
