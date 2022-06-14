package lesson4;

public class Animal {
    private int age;
    private String habitat;

    Animal(int age, String habitat) {
        this.age = age;
        this.habitat = habitat;
    }

    String getData() {
        return "Возраст этого животного составляет " + this.age + " лет, оно обитает в регионе " + this.habitat;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }

    int getAge() {
        return this.age;
    }

    void setHabitat(String newHabitat) {
        this.habitat = newHabitat;
    }

    String getHabitat() {
        return this.habitat;
    }
}
