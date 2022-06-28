package lesson7;

public class Worker {
    private Watch watch;

    public Worker(Watch watch) {
        this.watch = watch;
    }

    public void getTick() {
        try {
            watch.tick();
        } catch (WatchBrokenError err) {
            System.out.println(err.getMessage());
        }
    }
}
