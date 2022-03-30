public class Sale {
    public boolean SaleFruit(Fruit fruit) {
        if (fruit instanceof Fruit) {
            return true;
        }

        return false;
    }
}
