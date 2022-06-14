package lesson4;

public class Worker {
    private String name;
    private  int logBook;

    Worker(String name, int logBook) {
        this.name = name;
        this.logBook = logBook;
    }

    void setTakeGoods (Warehouse outskirts, int amount) {
        if (outskirts.getBalanse() - amount > 0) {
            outskirts.setBalance(outskirts.getBalanse() - amount);
            this.logBook += amount;
            System.out.println("Ура я, " + this.name + ", испортил водку!");
        } else {
            System.out.println("Недостаточно товара на складе");
        }

    }
    int getLogBook () {
        return this.logBook;
    }
}
