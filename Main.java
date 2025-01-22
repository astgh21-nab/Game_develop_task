public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
// create items
        Item sword1 = new Item("Iron Sword", Rarity.COMMON);
        Item sword2 = new Item("Iron Sword", Rarity.COMMON);

        inventory.addItem(sword1);
        inventory.addItem(sword2);

        inventory.displayInventory();

        inventory.upgradeItem(sword1);  // Common to Great
        inventory.upgradeItem(sword2);  // Common to Great

        // display after first upgrade 
        inventory.displayInventory();

    
        inventory.upgradeItem(sword1);  // Great to Rare
        inventory.upgradeItem(sword2);  // Great to Rare

        // display after second upgrade 
        inventory.displayInventory();
    }
}

