import java.util.*;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // for add items
    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }


    public boolean upgradeItem(Item item) {
        if (item.getRarity() == Rarity.COMMON) {
            // Common item upgrade Great
            items.remove(item);
            addItem(new Item(item.getName(), Rarity.GREAT));
            System.out.println("Upgraded " + item.getName() + " to Great!");
            return true;
        } else if (item.getRarity() == Rarity.GREAT) {
            // Great upgrade  Rare
            items.remove(item);
            addItem(new Item(item.getName(), Rarity.RARE));
            System.out.println("Upgraded " + item.getName() + " to Rare!");
            return true;
        } else if (item.getRarity() == Rarity.RARE) {
            // Rare upgrade Epic
            items.remove(item);
            addItem(new Item(item.getName(), Rarity.EPIC));
            System.out.println("Upgraded " + item.getName() + " to Epic!");
            return true;
        } else if (item.getRarity() == Rarity.EPIC) {
            // Epic upgrade Legendary
            items.remove(item);
            addItem(new Item(item.getName(), Rarity.LEGENDARY));
            System.out.println("Upgraded " + item.getName() + " to Legendary!");
            return true;
        }
        System.out.println("Item cannot be upgraded further.");
        return false;
    }
}

