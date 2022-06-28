package lesson7;

public class Fern extends Plant implements Bloomable{
    private String name;

    public Fern(String name) {
        this.name = name;
    }

    @Override
    public void canBloom() {
        System.out.println(this.name + ": умеет цвести");
    }
}
