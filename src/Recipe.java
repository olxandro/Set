import java.util.*;

public class Recipe {

    private Integer amountProduct;
//    private Set<Product> products = new HashSet<>();

    private Map<Product, Integer> products = new HashMap<>();
    private String nameRecipe;
    Set<Recipe> allRecepts = new HashSet<>();

    public Recipe(Map<Product, Integer> products, String nameRecipe) throws ProductException {
        this.products = products;
        for (Recipe recipe : allRecepts) {
            if (nameRecipe.equals(recipe.getNameRecipe())) {
                throw new ProductException("Такой рецепт есть");
            } else {
                this.nameRecipe = nameRecipe;
            }
        }
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, nameRecipe);
    }

    public void addProductInRecepe(Product product, int requaredQuantity) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Такой Рецепт уже есть!");
        }
        products.put(product, requaredQuantity);
    }
    public void sumProducts() {
         double sumProducts = 0;
      for (Product a : products.keySet()){
          sumProducts += products.get(a) * a.getPrice();

      }
        System.out.println(" Суммарная стоимость всех продуктов у данного рецепта = " + sumProducts );
    }


}