import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> fruitStocks = new HashMap<String, Integer>();

    public Inventory() {

    }

    public boolean addToInventory(Fruit fruit, int number) {
        if (fruit instanceof Fruit && number > 0) {
            fruitStocks.put(fruit.getName(), fruitStocks.getOrDefault(fruit.getName(), 0) + number);
            return true;
        }

        return false;
    }

    public boolean removeToInventory(Fruit fruit, int number) {
        if (fruit instanceof Fruit && number > 0 && (fruitStocks.getOrDefault(fruit.getName(), 0) - number) >= 0 ) {
            fruitStocks.put(fruit.getName(), fruitStocks.getOrDefault(fruit.getName(), 0) - number);
            return true;
        }

        return false;
    }

    public void display() {
        for (String fruit : fruitStocks.keySet()) {
            System.out.println("Fruit: " + fruit + " Amount: " + fruitStocks.get(fruit));
        }
    }
}
