package resturant_system;
import java.util.Comparator;

public class Food {
    private double price;
    public String name;
    public String  size;
    public int lastOrderAmount;

    public static Comparator<Food> foodComparator = (o1, o2) -> (int) (o1.price-o2.price);

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
      
    @Override
    public String toString() {
        return "{" +
                "price=>" + price +
                ", name=>'" + name + '\'' +
                ", size=>" + size +
                ", lastOrderAmount=>" + lastOrderAmount +
                '}'+"\n";
    }
}
