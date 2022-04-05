public class Fruit {
    private String name;
    private String type;
    private double pricePerKilogram;

    public Fruit(String name, String type, double pricePerKilogram) {
        this.name = setName(name);
        this.type = setType(type);
        this.pricePerKilogram = setPricePerkilogram(pricePerKilogram);
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setType(String type) {
        this.type = type;
        return type;
    }

    public double setPricePerkilogram(double pricePerKilogram) {
        if (pricePerKilogram <= 0.0) {
            System.out.println("Price cannot be lower than 0");
            return this.pricePerKilogram;
        } else {
            this.pricePerKilogram = pricePerKilogram;
            return pricePerKilogram;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPricePerKilogram() {
        return pricePerKilogram;
    }
}
