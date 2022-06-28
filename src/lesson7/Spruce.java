package lesson7;

public class Spruce extends Tree implements Smellable{
    private String name;

    public Spruce(String name) {
        this.name = name;
    }

    public void canSmell() {
        System.out.println(this.name + ": умеет пахнуть");
    }
}
