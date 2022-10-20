import java.util.HashSet;
import java.util.Set;

public class Product {

    private String name;
    private Double price;
    private Double weight;



    public Product(String name, Double price, Double weight) throws ProductException {
        if (name == null || price == null || weight == null){
        throw new ProductException("Заполните карточку товара полностью");
        } else {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


}
