public class Inventory {
    public boolean addToInventory(Fruit fruit) {
        if (fruit instanceof Fruit) {
            return true;
        }

        return false;
    }

    public boolean removeToInventory(Fruit fruit) {
        if (fruit instanceof Fruit) {
            return true;
        }

        return false;
    }
}
