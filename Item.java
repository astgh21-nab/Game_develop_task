public class Item {
    private String name;
    private Rarity rarity;

    public Item(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    // Getter
    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return name + " (" + rarity + ")";
    }
}

