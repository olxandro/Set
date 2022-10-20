import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private Set<Product> products = new HashSet<>();
    private double sumProducts;
    private String nameRecipe;
    Set<Recipe> allRecepts = new HashSet<>();

    public Recipe(Set<Product> products, String nameRecipe) throws ProductException {
        this.products = products;
        for (Recipe recipe : allRecepts) {
            if (nameRecipe.equals(recipe.getNameRecipe())) {
                throw new ProductException("Такой рецепт есть");
            } else {
                this.nameRecipe = nameRecipe;
            }
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getSumProducts() {
        return sumProducts;
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
        return Objects.hash(products, sumProducts, nameRecipe);
    }

    public void sumProducts() {
         double sumProducts = 0;
      for (Product a : products){
          sumProducts += a.getPrice();

      }
        System.out.println(" Суммарная стоимость всех продуктов у данного рецепта = " + sumProducts );
    }


}