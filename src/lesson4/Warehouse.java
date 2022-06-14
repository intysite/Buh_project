package lesson4;

public class Warehouse {
    private int bottleOfVodka;

    Warehouse(int bottleOfVodka) {
        this.bottleOfVodka = bottleOfVodka;
    }
    int getBalanse() {
        return this.bottleOfVodka;
    }

    void setBalance(int bottleOfVodka) {
        this.bottleOfVodka = bottleOfVodka;
    }

}
