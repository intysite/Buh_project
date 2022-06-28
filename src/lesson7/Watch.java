package lesson7;

public class Watch {
    private boolean isBrocken;

    public Watch(boolean isBrocken) {
        this.isBrocken = isBrocken;
    }

    public void tick() throws WatchBrokenError {
        if (isBrocken) {
            throw new WatchBrokenError("Ошибка: Часы сломались");
        }
        System.out.println("Часы тикают");
    }
}
