package lesson7;

public class Store {
    private Worker worker;

    public Store(Worker worker) {
        this.worker = worker;
    }

    public void getTick() {
        this.worker.getTick();
    }
}
