import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductException {
        Set<Product> a = new HashSet<>();
        Set<Product> b = new HashSet<>();


        Product banan = new Product("банан", 39.50, 3.50);
        Product coconut = new Product("кокос", 112.40, 1.50);
        Product apple = new Product("яблоко", 25.60, 5.20);
        Product orange = new Product("апельсин", 35.30, 6.5);
        Product grape = new Product("виноград", 120.30, 2.2);


        a.add(banan);
        a.add(coconut);
        a.add(apple);
        b.add(orange);
        b.add(grape);




        Recipe pirog = new Recipe(a, "Шарлотка");
        Recipe golobz = new Recipe(b,"голобец");


        Set<Recipe> allRecepts = new HashSet<>();
        allRecepts.add(pirog);
        allRecepts.add(golobz);
        allRecepts.add(golobz);
        pirog.sumProducts();

        List<Integer> numbers = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            numbers.add(i, (int) (Math.random() * 1000));
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (!(numbers.get(i) % 2 == 0)){
                numbers.remove(i);
            } else {
                System.out.println(numbers.get(i));
            }
        }
    }
}