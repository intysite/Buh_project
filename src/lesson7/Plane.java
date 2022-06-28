package lesson7;

public class Plane implements Flyable {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void fly() throws FlyException {
        if (this.countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
            }
        System.out.println("самолет летит");
        }
}
