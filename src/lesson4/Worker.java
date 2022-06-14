package lesson4;

public class Worker {
    private String name;
    private  int logBook = 0;

    Worker(String name) {
        this.name = name;
        }

    void setTakeGoods (Warehouse outskirts, int amount) {
        if (outskirts.getBalanse() - amount > 0) {
            outskirts.setBalance(outskirts.getBalanse() - amount);
            this.logBook += amount;
            System.out.println("Ура, я, " + this.name + ", испортил водку!");
        } else {
            System.out.println("Недостаточно товара на складе");
        }

    }
    int getLogBook () {
        return this.logBook;
    }
}
