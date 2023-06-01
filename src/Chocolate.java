public class Chocolate extends Product{

    private double caloricity;

    public double getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(double caloricity) {
        this.caloricity = caloricity;
    }

    public Chocolate(String brand, String name, double price, double caloricity) {
        super(brand, name, price);
        this.caloricity = caloricity;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка]%s - %s - %f - [калорийность: %f]", brand, name, price, caloricity);
    }
}
