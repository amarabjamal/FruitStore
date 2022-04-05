class Fruitstore {
    public static void main(String[] args) {
        Fruit[] fruits =    {
                                new Fruit("Durian", "Tropical", 100.00), 
                                new Fruit("Avocado", "Sub-tropical", 20.00),
                                new Fruit("Apple", "Temperate", 25.00)
                            };

        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName() + " - RM" + fruit.getPricePerKilogram() + "/kg");
        }
    }
}