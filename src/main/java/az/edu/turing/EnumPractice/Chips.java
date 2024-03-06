package az.edu.turing.EnumPractice;

public enum Chips {
    LAYS(60,"Lays",2.80),
    PRINGLES(100,"Pringles",5.60),
    DORITOS(55,"Doritos",2.50);

    final int levelOfDeliciousness;
    final String brand;
    final double price;

    Chips(int levelOfDeliciousness, String brand, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.brand = brand;
        this.price = price;
    }
}
