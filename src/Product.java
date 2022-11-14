import java.util.HashSet;
import java.util.Set;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;



    public Product(String name, Double price, Integer quantity) throws ProductException {
        if (name == null || price == null){
        throw new ProductException("Заполните карточку товара полностью");
        } else {
            this.name = name;
            this.price = price;
            if (quantity == null) {
                quantity = 1;
            }
            this.quantity = quantity;
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


    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
