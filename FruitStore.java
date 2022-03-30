class Fruitstore {
    public static void main(String[] args) {
        Fruit[] fruits =    {
                                new Fruit("Durian", "Tropical", 100.00), 
                                new Fruit("Avocado", "Sub-tropical", 20.00),
                                new Fruit("Apple", "Temperate", 25.00)
                            };

        for (Fruit fruit : fruits) {
            System.out.println(fruit.GetName() + " - RM" + fruit.GetPricePerKilogram() + "/kg");
        }
        // Fruit durian = new Fruit("Durian", "Tropical", 100.00);
        // Fruit avocado = new Fruit("Avocado", "Sub-tropical", 20.00);
        // Fruit apple = new Fruit("Apple", "Temperate", 25.00);

        // durian.SetPricePerkilogram(97);

        // System.out.println(durian.GetName() + " - RM" + durian.GetPricePerKilogram() + "/kg");
        // System.out.println(avocado.GetName() + " - RM" + avocado.GetPricePerKilogram() + "/kg");
        // System.out.println(apple.GetName() + " - RM" + apple.GetPricePerKilogram() + "/kg");
    }
}