public class Fruit {
    private String name;
    private String type;
    private double pricePerKilogram;

    public Fruit(String name, String type, double pricePerKilogram) {
        this.name = SetName(name);
        this.type = SetType(type);
        this.pricePerKilogram = SetPricePerkilogram(pricePerKilogram);
    }

    public String SetName(String name) {
        this.name = name;
        return name;
    }

    public String SetType(String type) {
        this.type = type;
        return type;
    }

    public double SetPricePerkilogram(double pricePerKilogram) {
        if (pricePerKilogram <= 0.0) {
            System.out.println("Price cannot be lower than 0");
            return this.pricePerKilogram;
        } else {
            this.pricePerKilogram = pricePerKilogram;
            return pricePerKilogram;
        }
    }

    public String GetName() {
        return name;
    }

    public String GetType() {
        return type;
    }

    public double GetPricePerKilogram() {
        return pricePerKilogram;
    }
}
