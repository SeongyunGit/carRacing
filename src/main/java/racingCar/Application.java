package racingCar;

public class Application {
    public static void main(String[] args) {
        CarModel model = new CarModel();
        CarView view = new CarView(model);
        String name = "";
        Car car = new Car(name);
        CarController controller = new CarController(view,car);
        controller.gameStart();
    }
}
