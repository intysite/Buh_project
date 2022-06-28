package lesson7;

public class Duck implements Flyable{
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void fly() throws FlyException {
        if(isInjured) {
                throw new FlyException("Ошибка: утка ранена");
            }
        System.out.println("утка летит");
    }
}
