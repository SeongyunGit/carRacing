package racingCar;

public class Application {
    public static void main(String[] args) {
        CarModel model = new CarModel();
        CarView view = new CarView(model);
        Car car = new Car();
        CarController controller = new CarController(view,car);
        controller.gameStart();
    }
}
