package lesson7;

public class Rose extends Plant implements Smellable, Bloomable{
    private String name;

    public Rose(String name) {
        this.name = name;
    }

   public void canSmell() {
        System.out.println(this.name + ": умеет пахнуть");
    }

    @Override
    public void canBloom() {
        System.out.println(this.name + ": умеет цвести");
    }
}
